package com.lwh.my02.mapper;

import com.lwh.my02.entity.Fund;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:06
 */
@Repository
public interface FundMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:06
     */
    Fund getById(String fundCode);

    /**
     * 新增
     *
     * @param fund 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:06
     */
    void addFund(Fund fund);

    /**
     * 批量新增
     *
     * @param funds 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:06
     */
    void addFunds(List<Fund> funds);

    /**
     * 编辑
     *
     * @param fund 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:06
     */
    void editFund(Fund fund);
}
