package com.boot.controller;

import com.boot.dao.UserInfoDao;
import com.boot.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mr on 2017/8/22.
 */
@RestController
public class BootController {

    @Autowired
    UserInfoDao userInfoDao;

    @RequestMapping("/boot")
    @Cacheable(value="key-Users")
    public List<UserInfo> getUsers(){
        List<UserInfo> users=userInfoDao.findAll();
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return users;
    }
}
