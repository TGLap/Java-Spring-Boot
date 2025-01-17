package com.example.databaseMysql.services;



import com.example.databaseMysql.domain.entities.ReviewEntity;

import java.util.List;
import java.util.Optional;


public interface ReviewService {

    ReviewEntity save(ReviewEntity product);

    List<ReviewEntity> findAll();

    Optional<ReviewEntity> findOne(Integer id);

    boolean isExist(Integer id);

    List<ReviewEntity> findAllByProductId(Integer productId);

}
