package com.holy.mycat.controller;

import com.holy.mycat.entity.User;
import com.holy.mycat.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName ArrangeWorkController
 * @Description 排班管理 controller
 * @Author chl
 * @Date 2019年7月26日
 * @Version 3.0
 **/
@RestController
@RequestMapping(path = "user/")
public class UserController {
    //车辆管理
    @Resource
    private UserService service;

    /**
     *
     * @param
     * @return
     */
    @GetMapping
    public String findAll() {
        service.findAll();
        return null;
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping
    public String saveOne(@RequestBody User user) {
        service.insertUser(user);
        return null;
    }

}