package com.mushanwb.github.service;

import com.mushanwb.github.entity.User;
import com.mushanwb.github.mapper.UserMapper;

import javax.inject.Inject;

public class UserService {

    private UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserByID(Integer userId) {
        System.out.println(userId);
        return userMapper.findUserById(userId);
    }
}
