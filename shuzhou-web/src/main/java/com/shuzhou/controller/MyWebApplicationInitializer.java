package com.shuzhou.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Administrator on 2018/4/15 0015.
 * 如果您需要在Spring Boot应用程序中执行servlet上下文初始化，则应该注册一个实现org.springframework.boot.web.servlet.ServletContextInitializer接口的bean。onStartup方法提供对ServletContext的访问，并且如有必要，可以很容易地用作现有WebApplicationInitializer的适配器。
 */
@Component
public class MyWebApplicationInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("servletContexst正在初始化");
        System.out.println(servletContext.getServerInfo());
    }
}
