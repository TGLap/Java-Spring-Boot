package com.example.databaseMysql.domain.dto;

import com.example.databaseMysql.domain.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDto {
    private Integer id;

    private UserEntity userEntity;

    private Integer quantity;
}
