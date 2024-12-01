package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.SupplierEntity;
import com.example.databaseMysql.repositories.SupplierRepository;
import com.example.databaseMysql.services.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    @Override
    public SupplierEntity save(SupplierEntity SupplierEntity) {
        return supplierRepository.save(SupplierEntity);
    }

    @Override
    public List<SupplierEntity> findAll() {
        return StreamSupport.stream(
                supplierRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SupplierEntity> findOne(Integer id) {
        return supplierRepository.findById(id);
    }

    @Override
    public boolean isExist(Integer id) {
        return supplierRepository.existsById(id);
    }
}
