package com.lwh.my02.mapper;

import com.lwh.my02.entity.HistoricalNetValue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:13
 */
@Repository
public interface HistoricalNetValueMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    HistoricalNetValue getById(String fundCode);

    /**
     * 新增
     *
     * @param historicalNetValue 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void addHistoricalNetValue(HistoricalNetValue historicalNetValue);

    /**
     * 批量新增
     *
     * @param historicalNetValues 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void addHistoricalNetValues(List<HistoricalNetValue> historicalNetValues);

    /**
     * 编辑
     *
     * @param historicalNetValue 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void editHistoricalNetValue(HistoricalNetValue historicalNetValue);
}
