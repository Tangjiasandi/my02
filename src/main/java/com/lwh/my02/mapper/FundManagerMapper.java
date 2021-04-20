package com.lwh.my02.mapper;

import com.lwh.my02.entity.FundManager;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:11
 */
@Repository
public interface FundManagerMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:11
     */
    FundManager getById(String fundManagerCode);

    /**
     * 新增
     *
     * @param fundManager 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:11
     */
    void addFundManager(FundManager fundManager);

    /**
     * 批量新增
     *
     * @param fundManagers 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:11
     */
    void addFundManagers(List<FundManager> fundManagers);

    /**
     * 编辑
     *
     * @param fundManager 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:11
     */
    void editFundManager(FundManager fundManager);
}
