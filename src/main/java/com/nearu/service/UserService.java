package com.nearu.service;

import com.nearu.biz.UserBiz;
import com.nearu.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserBiz userBiz;

    public int addUser(){
        User user = new User();
        user.setUserId(12L);
        user.setUserName("First");
        user.setStatus(1);
        user.setTel("123354265");
        user.setType(1);
        user.setModifiedTime(System.currentTimeMillis());
        user.setAddedTime(System.currentTimeMillis());
        return userBiz.addNewUser(user);
    }
}
