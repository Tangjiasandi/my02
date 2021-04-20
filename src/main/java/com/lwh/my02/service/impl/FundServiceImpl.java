package com.lwh.my02.service.impl;

import com.lwh.my02.entity.Fund;
import com.lwh.my02.mapper.FundMapper;
import com.lwh.my02.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:08
 */
@Service
public class FundServiceImpl implements FundService {
    @Autowired
    private FundMapper fundMapper;

    @Override
    public Fund getById(String id) {
        return this.fundMapper.getById(id);
    }
}