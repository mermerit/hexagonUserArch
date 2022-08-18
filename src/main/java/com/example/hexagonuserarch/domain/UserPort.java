package com.example.hexagonuserarch.domain;


import java.util.List;

public interface UserPort {

    User addUser(User user);

    List<User> getAllUser();


    void removeUser(Integer userId);

    User getUserById (Integer userId);

    User updateUser(User user);




}
