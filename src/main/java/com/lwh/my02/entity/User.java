package com.lwh.my02.entity;


import lombok.Data;

/**
 * @author 李文浩
 * @create 2021-04-15 22:19:14
 */
@Data
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userTelephone;
    private String userRegisterTime;
    private String userState;
}