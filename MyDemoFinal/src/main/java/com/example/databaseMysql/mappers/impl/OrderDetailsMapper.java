package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.domain.dto.OrderDetailsDto;
import com.example.databaseMysql.domain.entities.OrderDetailsEntity;
import com.example.databaseMysql.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailsMapper implements Mapper<OrderDetailsEntity, OrderDetailsDto> {
    private ModelMapper modelMapper;
    public OrderDetailsMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public OrderDetailsDto mapTo(OrderDetailsEntity OrderDetailsEntity) {
        return modelMapper.map(OrderDetailsEntity, OrderDetailsDto.class);
    }

    @Override
    public OrderDetailsEntity mapFrom(OrderDetailsDto OrderDetailsDto) {
        return modelMapper.map(OrderDetailsDto, OrderDetailsEntity.class);
    }
}
