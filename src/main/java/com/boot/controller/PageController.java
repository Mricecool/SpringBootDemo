package com.boot.controller;

import com.boot.dao.UserInfoDao;
import com.boot.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mr on 2017/8/22.
 */
@Controller
public class PageController {

    @Autowired
    UserInfoDao userInfoDao;

    @RequestMapping("/boots")
    public String getUsers(Model model){
        List<UserInfo> users=userInfoDao.findAll();
        model.addAttribute("single",users.get(0));
        model.addAttribute("users",users);
        return "index";
    }

}
