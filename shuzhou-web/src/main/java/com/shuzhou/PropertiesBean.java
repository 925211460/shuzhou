package com.shuzhou;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lufei on 18/4/13.
 * 用于接受application.properties中的bean
 * 如果你为自己的组件在properties文件中定义了一组配置key,那么建议把这些属性放到bean里面
 */
@ConfigurationProperties()
@Component
public class PropertiesBean {

    private String shuzhouProfilesActive;

    private String currentEnvironment;

    public String getShuzhouProfilesActive() {
        return shuzhouProfilesActive;
    }

    public void setShuzhouProfilesActive(String shuzhouProfilesActive) {
        this.shuzhouProfilesActive = shuzhouProfilesActive;
    }

    public String getCurrentEnvironment() {
        return currentEnvironment;
    }

    public void setCurrentEnvironment(String currentEnvironment) {
        this.currentEnvironment = currentEnvironment;
    }
}
