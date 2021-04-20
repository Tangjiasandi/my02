package com.lwh.my02.controller;

import com.lwh.my02.entity.User;
import com.lwh.my02.service.UserService;
import com.lwh.my02.tools.CommonFields;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @date 2021/4/15 22:28
 */
@Api(tags = "用户")
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("login")
    public String login(String userId,String passWord){
        User user = userService.getById("test");
        if(user==null){
            return "登陆失败，账号或密码错误";
        }
        return "ok";
    }

    @PostMapping("register")
    public String register(String userId,String password,String name,String phone){
        try {
            User user = new User();
            user.setUserId(userId);
            user.setUserPassword(password);
            user.setUserName(name);
            user.setUserTelephone(phone);
            user.setUserRegisterTime(CommonFields.getDate());
            user.setUserState("1");
            if(userService.add(user)){
                return "ok";
            }
            return "注册失败";
        }catch (Exception ex){
            ex.printStackTrace();
            return "注册失败";
        }
    }
}
