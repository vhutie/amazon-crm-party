/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazon.crm.party;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.amazon.crm.party.model.PartyInformation;
import com.amazon.crm.party.repo.PartyRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class PartyController {

    @Autowired
    private PartyService partyService;
    
    @Autowired
    private PartyRepository partyRepository;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/amazon-crm-party", produces = "text/plain")
    @ApiOperation("Returns the greeting in Portuguese")
    public String ola() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "Unknown");
        return String.format("Olá de %s", hostname);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/amazon-crm-party-chaining", produces = "application/json")
    @ApiOperation("Returns the greeting plus the next service in the chain")
    public List<String> sayHelloChaining() {
        List<String> greetings = new ArrayList<>();
        greetings.add(ola());
        greetings.addAll(partyService.party());
        return greetings;
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/amazon-crm-party-secured", produces = "text/plain")
    @ApiOperation("Returns a message that is only available for authenticated users")
    public String olaSecured(KeycloakPrincipal<RefreshableKeycloakSecurityContext> principal) {
        AccessToken token = principal.getKeycloakSecurityContext().getToken();
        return "This is a Secured resource. You are logged as " + token.getName();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/logout", produces = "text/plain")
    @ApiOperation("Logout")
    public String logout() throws ServletException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        request.logout();
        return "Logged out";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/health")
    @ApiOperation("Used to verify the health of the service")
    public String health() {
        return "I'm ok";
    }
    
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/party", produces = "application/json")
    @ApiOperation("Returns the list of parties")
    public List<PartyInformation> getAllParties() {
        List<PartyInformation> partyList = partyRepository.findAllByOrderByCreationDateDesc();
        
        return partyList;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/party/{id}", produces = "application/json")
    @ApiOperation("Returns the party by id")
    public PartyInformation getParty(@PathVariable("id") Long id) {
        PartyInformation party = partyRepository.findById(id).get();
        return party;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/party", produces = "application/json")
    @ApiOperation("Adds party information")
    public PartyInformation addParty(@RequestBody PartyInformation partyInformation) {
        PartyInformation savedParty = partyRepository.saveAndFlush(partyInformation);
        return savedParty;
    }
    
    
}
