package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.SupplierEntity;

import java.util.List;
import java.util.Optional;


public interface SupplierService {

    SupplierEntity save(SupplierEntity author);

    List<SupplierEntity> findAll();

    Optional<SupplierEntity> findOne(Integer id);

    boolean isExist(Integer id);


}
