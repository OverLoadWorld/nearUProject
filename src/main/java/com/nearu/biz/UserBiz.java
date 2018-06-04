package com.nearu.biz;

import com.nearu.dao.UserMapper;
import com.nearu.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBiz {
    @Resource
    private UserMapper userMapper;

    public int addNewUser(User user){
        return userMapper.insert(user);
    }
}
