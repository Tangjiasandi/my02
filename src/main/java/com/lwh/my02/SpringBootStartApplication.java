package com.lwh.my02;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @Date 2019-08-09 9:46
 * @description 发布到tomcat上需要的启动类
 **/
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(My02Application.class);
    }
}
