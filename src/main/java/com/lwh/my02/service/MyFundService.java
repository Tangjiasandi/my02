package com.lwh.my02.service;

import com.lwh.my02.entity.MyFund;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:13
 */
public interface MyFundService {
    /**
     * 根据ID查询
     *
     * @param id
     * @author 李文浩
     * @email 1002361618@qq.com
     * @create 2021-04-15 22:19:13
     */
    MyFund getById(String id);
}