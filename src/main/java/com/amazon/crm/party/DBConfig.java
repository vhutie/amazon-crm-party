package com.amazon.crm.party;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig{

       @Bean
       public DataSource dataSource(){
          DriverManagerDataSource dataSource = new DriverManagerDataSource();
          dataSource.setDriverClassName("org.postgresql.Driver");
          dataSource.setUrl("jdbc:postgresql://postgresql.amazon-crm.svc:5432/amazondb");
          dataSource.setUsername( "amazon" );
          dataSource.setPassword( "amazon" );
          return dataSource;
       }

}
