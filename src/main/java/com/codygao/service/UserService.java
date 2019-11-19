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

    public void insertUser(String name, Integer age, double money) {
        userDao.insertUser(name, age, money);
    }

    public User getUserByid(Integer id) {
        return userDao.getUserById(id);
    }

    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
