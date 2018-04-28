package com.shuzhou.controller;

import com.shuzhou.demo.UserService;
import com.shuzhou.domain.User;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lufei on 18/4/3.
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private AdminClient adminClient;

    @RequestMapping("/test")
    public void helloWorld(){
        System.out.println("hello spring boot");
    }

    @RequestMapping("/add")
    public void testAddUser(@RequestParam String userName){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.trace("---trace");
        logger.debug("---debug");
        logger.info("---info");
        logger.warn("---warn");
        logger.error("---err");

        User user = new User();
        user.setUsername(userName);
        userService.createUser(user);
    }

    @RequestMapping("/userList")
    public List<User> userList() {
        return userService.findAllUser();
    }
}
