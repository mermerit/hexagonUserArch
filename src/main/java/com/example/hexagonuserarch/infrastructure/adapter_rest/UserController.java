package com.example.hexagonuserarch.infrastructure.adapter_rest;

import com.example.hexagonuserarch.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserController {

    @GetMapping("/user")
    List<User> getUsers();

    @PostMapping("/user")
    User addUser(@RequestBody User user);

    @GetMapping("/user/{userId}")
    User findUserById(@PathVariable Integer userId);
    @DeleteMapping("/user/{userId}")
    String deleteUser(@PathVariable Integer userId);

    @PutMapping("/user")
    User updateUser(@RequestBody User user);


}
