package com.example.databaseMysql.services;

import com.example.databaseMysql.domain.entities.CategoryEntity;

import java.util.List;
import java.util.Optional;


public interface CategoryService {

    CategoryEntity save(CategoryEntity category);

    List<CategoryEntity> findAll();

    Optional<CategoryEntity> findOne(Integer id);

    boolean isExist(Integer id);


}
