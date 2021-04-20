package com.lwh.my02.mapper;

import com.lwh.my02.entity.FundCompany;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:10
 */
@Repository
public interface FundCompanyMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:10
     */
    FundCompany getById(String fundCompanyCode);

    /**
     * 新增
     *
     * @param fundCompany 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:10
     */
    void addFundCompany(FundCompany fundCompany);

    /**
     * 批量新增
     *
     * @param fundCompanys 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:10
     */
    void addFundCompanys(List<FundCompany> fundCompanys);

    /**
     * 编辑
     *
     * @param fundCompany 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:10
     */
    void editFundCompany(FundCompany fundCompany);
}
