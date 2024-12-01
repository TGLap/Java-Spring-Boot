package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}
