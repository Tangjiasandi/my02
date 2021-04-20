package com.lwh.my02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @date 2021/4/15 22:37
 */
@EnableAsync
@EnableScheduling
@MapperScan("com.lwh.*.mapper")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class, scanBasePackages = {"com.lwh.my02.*", "com.lwh.my02.*.*"})
public class My02Application {

    public static void main(String[] args) {
        SpringApplication.run(My02Application.class, args);
    }

}
