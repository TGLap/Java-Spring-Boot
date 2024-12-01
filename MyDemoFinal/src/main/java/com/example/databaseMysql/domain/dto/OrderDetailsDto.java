package com.example.databaseMysql.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailsDto {
    private Integer id;

    private OrderDto orderDto;

    private ProductDto productDto;

    private Integer quantity;

    private Float unitPrice;
}
