package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.UserEntity;

import java.util.List;
import java.util.Optional;


public interface UserService {

    UserEntity save(UserEntity author);

    List<UserEntity> findAll();

    Optional<UserEntity> findOne(Integer id);

    boolean isExist(Integer id);

    UserEntity findByUserName(String userName);

    List<UserEntity> findAllByIsActiveTrue();


}
