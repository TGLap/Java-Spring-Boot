package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.domain.dto.ShipmentDto;
import com.example.databaseMysql.domain.entities.ShipmentEntity;
import com.example.databaseMysql.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ShipmentMapper implements Mapper<ShipmentEntity, ShipmentDto> {
    private ModelMapper modelMapper;
    public ShipmentMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public ShipmentDto mapTo(ShipmentEntity ShipmentEntity) {
        return modelMapper.map(ShipmentEntity, ShipmentDto.class);
    }

    @Override
    public ShipmentEntity mapFrom(ShipmentDto ShipmentDto) {
        return modelMapper.map(ShipmentDto, ShipmentEntity.class);
    }
}
