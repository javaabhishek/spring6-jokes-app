package com.asoft.spring6jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
