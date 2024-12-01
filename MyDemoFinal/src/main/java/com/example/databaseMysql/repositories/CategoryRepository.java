package com.example.databaseMysql.repositories;

import com.example.databaseMysql.domain.entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
}
