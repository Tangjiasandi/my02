package com.lwh.my02.service;

import com.lwh.my02.entity.Fund;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:07
 */
public interface FundService {
    /**
     * 根据ID查询
     *
     * @param id
     * @author 李文浩
     * @email 1002361618@qq.com
     * @create 2021-04-15 22:19:07
     */
    Fund getById(String id);
}