package com.spring.mybatis.controller;

import com.spring.mybatis.dao.UserMapper;
import com.spring.mybatis.impl.UserImpl;
import com.spring.mybatis.model.User;
import com.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project:sm
 * User: xiaohui
 * Date: 2016/6/26
 * Time: 21:04
 * email:a6551142@163.com
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserImpl service;

    /**
     * 测试
     * @return
     */
    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }


    /**
     * 添加用户
     * @return
     */
    @RequestMapping("add")
    public String addUser(){
        User user = new User();
        user.setUserId("1000");
        user.setUserName("果粒橙");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        service.addUser(user);
        return "add";
    }

    /**
     * 查询当个用户通过Id
     * @return
     */
    @RequestMapping("get_user")
    public String getUserById(){
        service.getUserById("1000");
        return "index";
    }


    /**
     * 获取所有用户的信息
     * @return
     */
    @RequestMapping("get_all_user")
    public String getAllUser(){
        service.getAllUser();
        return "index";
    }
}
