package com.codygao.bean;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class User {

    private int id;

    @NotEmpty(message = "name不能为空")
    private String name;

    private int age;

    private double money;
}
