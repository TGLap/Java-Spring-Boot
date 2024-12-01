package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.SupplierEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends CrudRepository<SupplierEntity, Integer> {
}
