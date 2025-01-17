package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.PaymentEntity;
import com.example.databaseMysql.repositories.PaymentRepository;
import com.example.databaseMysql.services.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public PaymentEntity save(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<PaymentEntity> findAll() {
        return StreamSupport.stream(
                paymentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PaymentEntity> findOne(Integer id) {
        return paymentRepository.findById(id);
    }

    @Override
    public boolean isExist(Integer id) {
        return paymentRepository.existsById(id);
    }

    @Override
    public Optional<PaymentEntity> findOneByCreditCard(String creditCard) {
        return paymentRepository.findOneByCreditCard(creditCard);
    }
}
