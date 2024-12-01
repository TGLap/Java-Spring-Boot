package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.CartEntity;

import java.util.List;
import java.util.Optional;


public interface CartService {

    CartEntity save(CartEntity product);

    List<CartEntity> findAll();

    Optional<CartEntity> findOne(Integer id);

    boolean isExist(Integer id);

    CartEntity updateQuantity(Integer cartId);

}
