package com.lwh.my02.service;

import com.lwh.my02.entity.User;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:14
 */
public interface UserService {
    /**
     * 根据ID查询
     *
     * @param id
     * @author 李文浩
     * @email 1002361618@qq.com
     * @create 2021-04-15 22:19:14
     */
    User getById(String id);

    /**
     * @author 李文浩
     * @email 1002361618@qq.com
     * @date 2021/4/18 17:51
     */
    Boolean add(User user);
}