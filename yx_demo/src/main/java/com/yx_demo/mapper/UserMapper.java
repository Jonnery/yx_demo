package com.yx_demo.mapper;

import com.yx_demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author Guilin
 * @version 1.0
 * @date 2021/1/5 14:00
 */

@Repository
public interface UserMapper {

    User Sel(int id);

    User login(String userName,String passWord);

    int register(User user);
}

