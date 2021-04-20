package com.lwh.my02.service.impl;

import com.lwh.my02.entity.MyFund;
import com.lwh.my02.mapper.MyFundMapper;
import com.lwh.my02.service.MyFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:14
 */
@Service
public class MyFundServiceImpl implements MyFundService {
    @Autowired
    private MyFundMapper myFundMapper;

    @Override
    public MyFund getById(String id) {
        return this.myFundMapper.getById(id);
    }
}