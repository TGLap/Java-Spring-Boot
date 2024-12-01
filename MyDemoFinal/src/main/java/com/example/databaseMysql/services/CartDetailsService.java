package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.CartDetailsEntity;

import java.util.List;
import java.util.Optional;


public interface CartDetailsService {

    CartDetailsEntity save(CartDetailsEntity product);

    List<CartDetailsEntity> findAll();

    Optional<CartDetailsEntity> findOne(Integer id);

    boolean isExist(Integer id);
    void deleteById(Integer id);


}
