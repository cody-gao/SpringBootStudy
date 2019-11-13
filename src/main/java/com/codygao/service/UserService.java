package com.codygao.service;

import com.codygao.bean.User;
import com.codygao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 查找所有用户
     * @return
     */
    public List<User> selectAllUser() {
        return userDao.findAllUser();
    }

    public void insertUser() {
        userDao.insertUser("SnailClimb", 22, 3000.0);
    }
}
