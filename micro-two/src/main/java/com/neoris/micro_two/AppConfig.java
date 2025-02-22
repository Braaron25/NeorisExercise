package com.neoris.micro_two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    public WebClient registrarWebClient() {
        return WebClient.create("http://localhost:8080/api/v1");
    }
}

