package com.shuzhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lufei on 18/4/3.
 */
@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("/a")
    public void helloWorld(){
        System.out.println("hello spring boot");
    }
}
