package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.OrderDetailsEntity;

import java.util.List;
import java.util.Optional;


public interface OrderDetailsService {

    OrderDetailsEntity save(OrderDetailsEntity product);

    List<OrderDetailsEntity> findAll();
    List<OrderDetailsEntity> findAllByOrderId(Integer id);

    Optional<OrderDetailsEntity> findOne(Integer id);

    boolean isExist(Integer id);

    void deleteById(Integer id);


}
