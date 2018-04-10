package com.shuzhou.demo.impl;

import com.shuzhou.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shuzhou.domain.User;
import com.shuzhou.mapper.UserMapper;

import java.util.List;

/**
 * Created by lufei on 18/4/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserMapper userMapper;

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
