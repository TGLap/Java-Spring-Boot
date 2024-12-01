package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.PaymentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PaymentRepository extends CrudRepository<PaymentEntity, Integer> {
    Optional<PaymentEntity> findOneByCreditCard(String creditCard);
}
