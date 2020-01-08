package com.holy.mycat.service;

import com.holy.mycat.dao.UserDao;
import com.holy.mycat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;
    /**
     * insert
     *
     * @param user
     * @return
     */
    @Override
    public User insertUser(User user) {
        return dao.save(user);
    }

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
