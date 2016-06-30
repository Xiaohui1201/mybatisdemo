package com.spring.mybatis.service;

import com.spring.mybatis.dao.UserMapper;
import com.spring.mybatis.impl.UserImpl;
import com.spring.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project:sm
 * User: xiaohui
 * Date: 2016/6/26
 * Time: 22:13
 * email:a6551142@163.com
 */
@Service
public class UserService implements UserImpl{
    @Autowired
    private UserMapper dao;
    @Override
    public void addUser(User user) {
        dao.insert(user);
    }

    @Override
    public User getUserById(String id) {
        User user = dao.selectByPrimaryKey(id);
        System.out.println(user.getUserName());
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUser = dao.getAllUser();
        for(User user :allUser){
            System.out.println(user.getUserName()+":"+user.getUserSalary());
        }
        return allUser;
    }


}
