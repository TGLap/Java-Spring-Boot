package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.ShipmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShipmentRepository extends CrudRepository<ShipmentEntity, Integer> {
}
