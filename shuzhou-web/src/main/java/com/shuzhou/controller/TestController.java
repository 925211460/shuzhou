package com.shuzhou.controller;

import com.shuzhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.shuzhou.domain.User;

/**
 * Created by lufei on 18/4/3.
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public void helloWorld(){
        System.out.println("hello spring boot");
    }

    @RequestMapping("/add")
    public void testAddUser(@RequestParam String userName){
        User user = new User();
        user.setUsername(userName);
        userService.createUser(user);
    }
}
