package com.lwh.my02.mapper;

import com.lwh.my02.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李文浩
 * @mail 1002361618@qq.com
 * @create 2021-04-15 22:19:14
 */
@Repository
public interface UserMapper {

    /**
     * 根据ID查询数据
     *
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:14
     */
    User getById(String userId);

    /**
     * 新增
     *
     * @param user 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:14
     */
    void addUser(User user);

    /**
     * 批量新增
     *
     * @param users 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:14
     */
    void addUsers(List<User> users);

    /**
     * 编辑
     *
     * @param user 实体
     * @return
     * @author 李文浩
     * @date 2021-04-15 22:19:14
     */
    void editUser(User user);
}
