package com.shuzhou;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Created by lufei on 18/4/13.
 * 用于接受application.properties中的bean
 * 如果你为自己的组件在properties文件中定义了一组配置key,那么建议把这些属性放到bean里面
 */
@ConfigurationProperties(prefix = "shuzhou")
@Component
@Validated
public class AppSystemProperties {
    @NotNull
    private String currentEnvironment;

    private List list;

    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout = Duration.ofSeconds(30);

    //如果不指定时间单位，则默认的单位是ms,但是配置文件中可以使用1000S，表示1000秒
    private Duration readTimeout = Duration.ofMillis(1000);

    public String getCurrentEnvironment() {
        return currentEnvironment;
    }

    public void setCurrentEnvironment(String currentEnvironment) {
        this.currentEnvironment = currentEnvironment;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }
}
