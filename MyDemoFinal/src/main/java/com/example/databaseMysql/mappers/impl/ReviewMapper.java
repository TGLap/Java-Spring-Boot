package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.domain.dto.ReviewDto;
import com.example.databaseMysql.domain.entities.ReviewEntity;
import com.example.databaseMysql.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper implements Mapper<ReviewEntity, ReviewDto> {
    private ModelMapper modelMapper;

    public ReviewMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public ReviewDto mapTo(ReviewEntity ReviewEntity) {
        ReviewDto reviewDto= modelMapper.map(ReviewEntity, ReviewDto.class);
        reviewDto.setProductId(ReviewEntity.getProductEntity().getId());
        reviewDto.setUserId(ReviewEntity.getUserEntity().getId());
        return reviewDto;
    }

    @Override
    public ReviewEntity mapFrom(ReviewDto ReviewDto) {
        ReviewEntity reviewEntity =  modelMapper.map(ReviewDto, ReviewEntity.class);
        return reviewEntity;
    }
}
