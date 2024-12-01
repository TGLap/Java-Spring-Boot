package com.example.databaseMysql.services.impl;

import com.example.databaseMysql.domain.entities.UserEntity;
import com.example.databaseMysql.repositories.UserRepository;
import com.example.databaseMysql.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository)
    {

        this.userRepository = userRepository;
    }
    public UserEntity save(UserEntity author) {
        return userRepository.save(author);
    }

    @Override
    public List<UserEntity> findAll() {
          return StreamSupport.stream(userRepository
                         .findAll()
                         .spliterator(), false)
                 .collect(Collectors.toList());
    }

    @Override
    public Optional<UserEntity> findOne(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean isExist(Integer id) {
        return userRepository.existsById(id);
    }

    @Override
    public UserEntity findByUserName(String userName) {
        List<UserEntity> result = userRepository.findByUsername(userName);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public List<UserEntity> findAllByIsActiveTrue() {
        return userRepository.findAllByIsActiveTrue();
    }


}
