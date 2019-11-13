package com.codygao.controller;

import com.codygao.bean.User;
import com.codygao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAllUser")
    public List<User> selectAllUser() {
        userService.insertUser();
        return userService.selectAllUser();
    }
}
