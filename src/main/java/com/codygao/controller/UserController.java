package com.codygao.controller;

import com.codygao.bean.User;
import com.codygao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectAllUser")
    public List<User> selectAllUser(@NotEmpty(message = "name不能为空哦") @RequestParam("name") String name, @RequestParam("age") Integer age,
                                    @RequestParam("money") double money) {

        userService.insertUser(name, age, money);
        return userService.selectAllUser();
    }

    @RequestMapping("getUserById")
    public User getUserById(@NotNull(message = "id不能为空哦") @RequestParam("id") Integer id) {
        return userService.getUserByid(id);
    }

    @RequestMapping("findUserByName")
    @Valid
    public User findUserByName(@RequestParam("name") String name) {
        return userService.findUserByName(name);
    }
}
