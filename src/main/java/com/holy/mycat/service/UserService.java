package com.holy.mycat.service;

import com.holy.mycat.entity.User;

import java.util.List;

public interface UserService {

    /**
     * insert
     * @param user
     * @return
     */
    User insertUser(User user);

    /**
     *
     * @return
     */
    List<User> findAll();

}
