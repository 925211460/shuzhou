package com.shuzhou.demo.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        PageHelper.startPage(1,0);
        List<User> allUser = userMapper.findAllUser();
        PageInfo page = new PageInfo(allUser);
        System.out.println("pageNum:"+page.getPageNum());
        System.out.println("totalPage:"+page.getPages());
        System.out.println("totalcount:"+page.getTotal());
        System.out.println("isHasPreviousPage"+page.isHasNextPage());
        return allUser;
    }
}
