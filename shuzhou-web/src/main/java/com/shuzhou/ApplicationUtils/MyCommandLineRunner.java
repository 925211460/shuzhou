package com.shuzhou.ApplicationUtils;

import com.shuzhou.PropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/4/12 0012.
 * 如果你需要在SpringApplication启动后运行一些特定的代码，你可以实现ApplicationRunner或者CommandLineRunner接口。
 * 两个接口都以相同的方式工作，并提供一个单独的run方法，这个方法在SpringApplication.run（...）完成之前被调用。
 * CommandLineRunner接口作为一个简单的字符串数组提供对应用程序参数的访问，
 * 而ApplicationRunner使用前面讨论的ApplicationArguments接口。以下示例显示带有run方法的CommandLineRunner：
 */
@Component
@EnableConfigurationProperties(PropertiesBean.class)
public class MyCommandLineRunner implements CommandLineRunner{

    @Value("${my.uuid}")
    private String uuid;

    @Value("${spring.config.location}")
    private String configLocation;

    @Autowired
    private PropertiesBean propertiesBean;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("程序马上就要起飞了,参数有---"+strings.toString());
        System.out.println("uuid---"+uuid);
        System.out.println("spring.config.location---"+configLocation);
        System.out.println("activeProfile---"+propertiesBean.getShuzhouProfilesActive());
        System.out.println("currentEnvironment---"+propertiesBean.getCurrentEnvironment());
    }
}
