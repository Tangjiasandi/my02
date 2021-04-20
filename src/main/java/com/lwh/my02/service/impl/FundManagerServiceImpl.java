package com.lwh.my02.service.impl;

import com.lwh.my02.entity.FundManager;
import com.lwh.my02.mapper.FundManagerMapper;
import com.lwh.my02.service.FundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:11
 */
@Service
public class FundManagerServiceImpl implements FundManagerService {
    @Autowired
    private FundManagerMapper fundManagerMapper;

    @Override
    public FundManager getById(String id) {
        return this.fundManagerMapper.getById(id);
    }
}