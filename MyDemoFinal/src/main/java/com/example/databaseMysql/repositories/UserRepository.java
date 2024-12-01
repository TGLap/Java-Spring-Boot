package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findByUsername(String userName);
    List<UserEntity> findAllByIsActiveTrue();
}

