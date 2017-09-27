package com.boot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by mr on 2017/8/7.
 */
@Component
@ConfigurationProperties(prefix = "mset")
public class Mset {

    private String user;
    private String address;

    /**
     * 获取
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
