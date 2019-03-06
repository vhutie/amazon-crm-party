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
package com.amazon.crm.party.services;

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

import com.amazon.crm.party.model.Individual;
import com.amazon.crm.party.model.PartyInformation;
import com.amazon.crm.party.repo.IndividualRepository;
import com.amazon.crm.party.repo.PartyRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/amazon-individual-api")
public class IndividualController {

    
    @Autowired
    private IndividualRepository individualRepository;
   
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    @ApiOperation("Used to verify the health of the service")
    public String health() {
        return "I'm ok";
    }
    
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/party-management/individual", produces = "application/json")
    @ApiOperation("Returns the list of individuals")
    public List<Individual> getAllIndividuals() {
        List<Individual> individualList = individualRepository.findAllByOrderByFullNameAsc();
        return individualList;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/party-management/individual/{individualId}", produces = "application/json")
    @ApiOperation("Returns the individual by id")
    public Individual getIndividual(@PathVariable("individualId") Long id) {
    		Individual individual = individualRepository.findById(id).get();
        return individual;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/party-management/individual", produces = "application/json")
    @ApiOperation("Adds individual information")
    public Individual addIndividual(@RequestBody Individual individual) {
    		Individual savedIndividual = individualRepository.saveAndFlush(individual);
        return savedIndividual;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, value = "/party-management/individual/{individualId}", produces = "application/json")
    @ApiOperation("Returns the individual by id")
    public Individual removeIndividual(@PathVariable("individualId") Long id) {
    		Individual individual = individualRepository.findById(id).get();
        return individual;
    }
    
    
}
