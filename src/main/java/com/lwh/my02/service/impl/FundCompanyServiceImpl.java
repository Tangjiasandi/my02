package com.lwh.my02.service.impl;

import com.lwh.my02.entity.FundCompany;
import com.lwh.my02.mapper.FundCompanyMapper;
import com.lwh.my02.service.FundCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @email 1002361618@qq.com
 * @create 2021-04-15 22:19:11
 */
@Service
public class FundCompanyServiceImpl implements FundCompanyService {
    @Autowired
    private FundCompanyMapper fundCompanyMapper;

    @Override
    public FundCompany getById(String id) {
        return this.fundCompanyMapper.getById(id);
    }
}