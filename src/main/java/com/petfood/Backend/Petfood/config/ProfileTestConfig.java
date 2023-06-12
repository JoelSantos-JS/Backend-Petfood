package com.petfood.Backend.Petfood.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.petfood.Backend.Petfood.services.DbService;

@Configuration
@Profile("test")
public class ProfileTestConfig {

    @Autowired
    private DbService dbService;

    @Bean
    public void instanciaBaseDeDados() {
        this.dbService.instanciaBaseDeDados();
    }
}
