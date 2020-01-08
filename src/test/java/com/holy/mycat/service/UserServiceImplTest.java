package com.holy.mycat.service;

import com.holy.mycat.MycatApplication;
import com.holy.mycat.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MycatApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserService service;

    @Test
    public void insertUser() {
        for (int i = 0 ;i < 300 ; i ++){
            User user = new User();
            user.setUsername(String.valueOf(i));
            user.setId((long) i + 1);
            service.insertUser(user);
            System.out.println("+++++++++++++++ now :" + i);
        }
    }

    @Test
    public void findAll() {
        List<User> userList = service.findAll();
        userList.stream().forEach(item -> System.out.println(item.getId()));
    }
}