package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.OrderDetailsEntity;
import com.example.databaseMysql.repositories.OrderDetailsRepository;
import com.example.databaseMysql.services.OrderDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    private OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsServiceImpl(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }


    @Override
    public OrderDetailsEntity save(OrderDetailsEntity product) {
        return orderDetailsRepository.save(product);
    }

    @Override
    public List<OrderDetailsEntity> findAll() {
        return StreamSupport.stream(
                orderDetailsRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderDetailsEntity> findAllByOrderId(Integer id) {
        return orderDetailsRepository.findAllByOrderId(id);
    }

    @Override
    public Optional<OrderDetailsEntity> findOne(Integer id) {
        return orderDetailsRepository.findById(id);
    }

    @Override
    public boolean isExist(Integer id) {
        return orderDetailsRepository.existsById(id);
    }

    @Override
    public void deleteById(Integer id) {
//        Optional<OrderDetailsEntity> found = findOne(id);
        orderDetailsRepository.deleteById(id);
    }
}
