package com.example.hexagonuserarch.infrastructure.adapter_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByUserId (Integer userId);


}
