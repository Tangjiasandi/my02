package com.lwh.my02.mapper;

import com.lwh.my02.entity.MyFund;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:13
 */
@Repository
public interface MyFundMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    MyFund getById(String userId);

    /**
     * 新增
     *
     * @param myFund 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void addMyFund(MyFund myFund);

    /**
     * 批量新增
     *
     * @param myFunds 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void addMyFunds(List<MyFund> myFunds);

    /**
     * 编辑
     *
     * @param myFund 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:13
     */
    void editMyFund(MyFund myFund);
}
