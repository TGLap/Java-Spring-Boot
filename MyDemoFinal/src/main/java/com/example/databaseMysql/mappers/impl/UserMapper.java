package com.example.databaseMysql.mappers.impl;

import com.example.databaseMysql.domain.dto.authentication.UserDto;
import com.example.databaseMysql.domain.entities.UserEntity;
import com.example.databaseMysql.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, UserDto> {
    private ModelMapper modelMapper;
    public UserMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;

    }
    @Override
    public UserDto mapTo(UserEntity userEntity) {
        return modelMapper.map(userEntity, UserDto.class);
    }

    @Override
    public UserEntity mapFrom(UserDto userDto) {
        return modelMapper.map(userDto, UserEntity.class);
    }
}
