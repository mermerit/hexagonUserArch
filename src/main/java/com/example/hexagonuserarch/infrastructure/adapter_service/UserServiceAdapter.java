package com.example.hexagonuserarch.infrastructure.adapter_service;

import com.example.hexagonuserarch.domain.User;
import com.example.hexagonuserarch.domain.UserPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceAdapter implements UserService{

    private UserPort userPort;


    @Autowired
    public UserServiceAdapter(UserPort userPort){

    this.userPort=userPort;

    }



    @Override
    public User addUser(User user) {

        userPort.addUser(user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return userPort.getAllUser();
    }

    @Override
    public User findUserById(Integer userId) {
        return userPort.getUserById(userId);
    }

    @Override
    public void removeUser(Integer userId) {

         userPort.removeUser(userId);

    }

    @Override
    public User updateUser(User user) {
        return userPort.updateUser(user);
    }
}
