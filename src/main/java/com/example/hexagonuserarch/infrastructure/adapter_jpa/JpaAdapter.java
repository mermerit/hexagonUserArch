package com.example.hexagonuserarch.infrastructure.adapter_jpa;


import com.example.hexagonuserarch.domain.User;
import com.example.hexagonuserarch.domain.UserPort;
import com.example.hexagonuserarch.infrastructure.exception.ResourseNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JpaAdapter implements UserPort {

    private UserRepository userRepository;

    @Autowired
    public JpaAdapter (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User addUser(User user) {
        UserEntity userEntity= new UserEntity();
        BeanUtils.copyProperties(user,userEntity);
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public List<User> getAllUser() {

        List<User> userList = new ArrayList<User>();
        List<UserEntity> userEntityList = userRepository.findAll();
        for(UserEntity userEntity : userEntityList){
            User user = new User();
            BeanUtils.copyProperties(userEntity,user);
            userList.add(user);
        }
        return userList;

    }



    @Override
    public void removeUser(Integer userId) {

     UserEntity userEntity = new UserEntity();
        Optional<UserEntity >userEntity1= Optional.ofNullable(userRepository.findByUserId(userId));
        UserEntity theUser=null;

        if (userEntity1.isPresent()) {
            theUser=userEntity1.get();
        }
        else
        {
            throw new RuntimeException("Did not find student id "+userId);
        }

            User user= new User();
            BeanUtils.copyProperties(user,userEntity);

                userRepository.delete(theUser);
    }
    @Override
    public User getUserById(Integer userId) {

    Optional<UserEntity >userEntity= Optional.ofNullable(userRepository.findByUserId(userId));
    UserEntity theUser=null;

        if (userEntity.isPresent()) {
            theUser=userEntity.get();
        }
        else {
            throw new RuntimeException("Did not find student id " + userId);
        }
        User user=new User();
        BeanUtils.copyProperties(theUser,user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        UserEntity userEntity =new UserEntity();
        BeanUtils.copyProperties(user,userEntity);
        userRepository.save(userEntity);

        return user;
    }
}
