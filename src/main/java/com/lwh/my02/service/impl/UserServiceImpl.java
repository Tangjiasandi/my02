package com.lwh.my02.service.impl;

import com.lwh.my02.entity.User;
import com.lwh.my02.mapper.UserMapper;
import com.lwh.my02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:14
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) {
        return this.userMapper.getById(id);
    }

    @Override
    @Transactional
    public Boolean add(User user) {
        userMapper.addUser(user);
        return true;
    }
}