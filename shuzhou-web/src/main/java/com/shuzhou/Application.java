package com.shuzhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

/**
 * Created by lufei on 18/4/3.
 */
@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
