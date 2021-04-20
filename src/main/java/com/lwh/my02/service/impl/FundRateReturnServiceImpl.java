package com.lwh.my02.service.impl;

import com.lwh.my02.entity.FundRateReturn;
import com.lwh.my02.mapper.FundRateReturnMapper;
import com.lwh.my02.service.FundRateReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:12
 */
@Service
public class FundRateReturnServiceImpl implements FundRateReturnService {
    @Autowired
    private FundRateReturnMapper fundRateReturnMapper;

    @Override
    public FundRateReturn getById(String id) {
        return this.fundRateReturnMapper.getById(id);
    }
}