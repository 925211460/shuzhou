package com.shuzhou.demo;

import com.shuzhou.domain.User;

import java.util.List;

/**
 * Created by lufei on 18/4/9.
 */
public interface UserService {
    public void createUser(User user);

    public List<User> findAllUser();
}
