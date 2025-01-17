package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.PaymentEntity;

import java.util.List;
import java.util.Optional;


public interface PaymentService {

    PaymentEntity save(PaymentEntity product);

    List<PaymentEntity> findAll();

    Optional<PaymentEntity> findOne(Integer id);

    boolean isExist(Integer id);

    Optional<PaymentEntity> findOneByCreditCard(String creditCard);

}
