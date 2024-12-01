package com.example.databaseMysql.domain.dto;

import com.example.databaseMysql.domain.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Integer id;

//    private UserEntity userEntity;
    private Integer userId;

    private Float total;

    private Integer paymentID;

    private Date paymentDate;

    private Date orderDate;

    private Integer shippingID;

    private Integer status;

    private UserEntity sellerEntity;

    private Boolean isActive;
}
