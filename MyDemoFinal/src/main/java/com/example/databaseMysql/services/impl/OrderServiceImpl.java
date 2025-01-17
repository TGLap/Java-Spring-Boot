package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.OrderDetailsEntity;
import com.example.databaseMysql.domain.entities.OrderEntity;
import com.example.databaseMysql.repositories.OrderDetailsRepository;
import com.example.databaseMysql.repositories.OrderRepository;

import com.example.databaseMysql.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private OrderDetailsRepository orderDetailsRepository;

    public OrderServiceImpl(OrderRepository orderRepository,
                            OrderDetailsRepository orderDetailsRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailsRepository = orderDetailsRepository;
    }


    @Override
    public OrderEntity save(OrderEntity order) {
        return orderRepository.save(order);
    }

    @Override
    public List<OrderEntity> findAll() {
        return StreamSupport.stream(
                orderRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OrderEntity> findOne(Integer id) {
        return orderRepository.findById(id);

    }

    @Override
    public boolean isExist(Integer id) {
        return orderRepository.existsById(id);
    }

    @Override
    public OrderEntity updateTotal(Integer orderId) {
        Optional<OrderEntity> foundorderEntity = findOne(orderId);
        OrderEntity orderEntity = foundorderEntity.get();
        List<OrderDetailsEntity> orderDetailsEntityList = orderDetailsRepository.findAllByOrderId(orderId);
        float total = 0.0f;
        for (OrderDetailsEntity orderDetailsEntity:orderDetailsEntityList) {
            total += orderDetailsEntity.getUnitPrice() * orderDetailsEntity.getQuantity();
        }
        orderEntity.setTotal(total);
        OrderEntity updatedOrder = orderRepository.save(orderEntity);
        return updatedOrder;
    }
}
