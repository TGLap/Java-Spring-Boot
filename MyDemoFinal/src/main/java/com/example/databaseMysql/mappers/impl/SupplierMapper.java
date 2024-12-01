package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.domain.dto.SupplierDto;
import com.example.databaseMysql.domain.entities.SupplierEntity;
import com.example.databaseMysql.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SupplierMapper implements Mapper<SupplierEntity, SupplierDto> {
    private ModelMapper modelMapper;
    public SupplierMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public SupplierDto mapTo(SupplierEntity SupplierEntity) {
        return modelMapper.map(SupplierEntity, SupplierDto.class);
    }

    @Override
    public SupplierEntity mapFrom(SupplierDto SupplierDto) {
        return modelMapper.map(SupplierDto, SupplierEntity.class);
    }
}
