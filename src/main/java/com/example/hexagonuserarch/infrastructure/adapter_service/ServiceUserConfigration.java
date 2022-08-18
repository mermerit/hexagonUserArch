package com.example.hexagonuserarch.infrastructure.adapter_service;

import com.example.hexagonuserarch.domain.UserPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceUserConfigration {

    @Bean
    public UserService getUserService (UserPort userPort){


        return new UserServiceAdapter(userPort);

    }
}
