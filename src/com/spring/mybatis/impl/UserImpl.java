package com.spring.mybatis.impl;

import com.spring.mybatis.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project:sm
 * User: xiaohui
 * Date: 2016/6/26
 * Time: 22:10
 * email:a6551142@163.com
 */

public interface UserImpl {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 查询用户通过id
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
}
