package com.example.hexagonuserarch.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data


public class User {

    private Integer userId;

    private String name;

    private String email;

    public User (){
        super();
    }
}
