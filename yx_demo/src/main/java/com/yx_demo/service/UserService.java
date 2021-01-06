package com.yx_demo.service;

import com.yx_demo.entity.User;
import com.yx_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author Guilin
 * @version 1.0
 * @date 2021/1/5 14:00
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
