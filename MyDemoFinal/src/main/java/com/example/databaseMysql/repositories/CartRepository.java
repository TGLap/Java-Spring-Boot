package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends CrudRepository<CartEntity, Integer> {
}
