package com.example.hexagonuserarch.infrastructure.adapter_jpa;

import com.example.hexagonuserarch.domain.UserPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserJpaConfigration
{
    @Bean
    public UserPort getUserPort(UserRepository userRepository){

        return new JpaAdapter(userRepository);

    }

}
