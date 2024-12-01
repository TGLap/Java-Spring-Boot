package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.mappers.Mapper;
import com.example.databaseMysql.domain.dto.OrderDto;
import com.example.databaseMysql.domain.entities.OrderEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements Mapper<OrderEntity, OrderDto> {
    private ModelMapper modelMapper;
    public OrderMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public OrderDto mapTo(OrderEntity OrderEntity) {
        OrderDto orderDto =  modelMapper.map(OrderEntity, OrderDto.class);
        orderDto.setUserId(OrderEntity.getUserEntity().getId());
        orderDto.setShippingID(OrderEntity.getShipmentEntity().getId());
        orderDto.setPaymentID(OrderEntity.getPaymentEntity().getId());
        return orderDto;
    }

    @Override
    public OrderEntity mapFrom(OrderDto OrderDto) {
        return modelMapper.map(OrderDto, OrderEntity.class);
    }
}
