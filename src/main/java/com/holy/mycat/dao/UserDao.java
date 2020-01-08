package com.holy.mycat.dao;

import com.holy.mycat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description
 * @Author
 * @Date
 * @Version
 **/
@Repository
public interface UserDao  extends JpaRepository<User,String> , JpaSpecificationExecutor<User> {

}