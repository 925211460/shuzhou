package com.shuzhou;

import com.shuzhou.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lufei on 18/4/3.
 */
@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.shuzhou.mapper",markerInterface = MyMapper.class)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
