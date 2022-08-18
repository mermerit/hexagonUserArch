package com.example.hexagonuserarch.infrastructure.adapter_service;

import com.example.hexagonuserarch.domain.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    List<User> getUsers ();

    User findUserById (Integer userId);

    void removeUser(Integer userId);

    User updateUser (User user);
}
