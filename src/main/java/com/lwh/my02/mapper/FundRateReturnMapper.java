package com.lwh.my02.mapper;

import com.lwh.my02.entity.FundRateReturn;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:12
 */
@Repository
public interface FundRateReturnMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:12
     */
    FundRateReturn getById(String fundCode);

    /**
     * 新增
     *
     * @param fundRateReturn 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:12
     */
    void addFundRateReturn(FundRateReturn fundRateReturn);

    /**
     * 批量新增
     *
     * @param fundRateReturns 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:12
     */
    void addFundRateReturns(List<FundRateReturn> fundRateReturns);

    /**
     * 编辑
     *
     * @param fundRateReturn 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:12
     */
    void editFundRateReturn(FundRateReturn fundRateReturn);
}
