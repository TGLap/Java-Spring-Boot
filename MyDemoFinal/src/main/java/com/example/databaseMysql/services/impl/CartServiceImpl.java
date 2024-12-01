package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.CartDetailsEntity;
import com.example.databaseMysql.domain.entities.CartEntity;
import com.example.databaseMysql.repositories.CartDetailsRepository;
import com.example.databaseMysql.repositories.CartRepository;
import com.example.databaseMysql.services.CartService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;
    private CartDetailsRepository cartDetailsRepository;

    public CartServiceImpl(CartRepository cartRepository, CartDetailsRepository cartDetailsRepository) {
        this.cartRepository = cartRepository;
        this.cartDetailsRepository = cartDetailsRepository;
    }


    @Override
    public CartEntity save(CartEntity cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<CartEntity> findAll() {
        return StreamSupport.stream(
                cartRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CartEntity> findOne(Integer id) {
        return cartRepository.findById(id);
    }

    @Override
    public boolean isExist(Integer id) {
        return cartRepository.existsById(id);
    }

    @Override
    public CartEntity updateQuantity(Integer cartId) {
        Optional<CartEntity> foundCart = findOne(cartId);
        CartEntity cartEntity = foundCart.get();
        List<CartDetailsEntity> cartDetailsEntityList = cartDetailsRepository.findAllByCartId(cartId);
        cartEntity.setQuantity(cartDetailsEntityList.size());
        CartEntity updatedCart = cartRepository.save(cartEntity);
        return updatedCart;
    }
}
