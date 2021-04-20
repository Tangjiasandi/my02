package com.lwh.my02.service.impl;

import com.lwh.my02.entity.HistoricalNetValue;
import com.lwh.my02.mapper.HistoricalNetValueMapper;
import com.lwh.my02.service.HistoricalNetValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:13
 */
@Service
public class HistoricalNetValueServiceImpl implements HistoricalNetValueService {
    @Autowired
    private HistoricalNetValueMapper historicalNetValueMapper;

    @Override
    public HistoricalNetValue getById(String id) {
        return this.historicalNetValueMapper.getById(id);
    }
}