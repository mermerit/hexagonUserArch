package com.example.hexagonuserarch.infrastructure.adapter_rest;

import com.example.hexagonuserarch.domain.User;
import com.example.hexagonuserarch.infrastructure.adapter_service.UserService;
import com.example.hexagonuserarch.infrastructure.exception.ResourseNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService){

        this.userService=userService;
    }

    @Override
    public List<User> getUsers() {
       List <User> users=userService.getUsers();
        return  users;
    }

    @Override
    public User addUser(User user) {

          userService.addUser(user);

          return user;
    }

    @Override
    public User findUserById(Integer userId) {

        return userService.findUserById(userId);
    }

    @Override
    public String deleteUser(Integer userId)     {

         userService.removeUser(userId);


         return "the ID" +userId+" was deleted";
    }

    @Override
    public User updateUser(User user) {

         userService.updateUser(user);

         return  user;
    }
}
