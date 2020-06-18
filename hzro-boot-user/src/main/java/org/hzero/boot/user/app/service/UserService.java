package org.hzero.boot.user.app.service;

import org.hzero.boot.user.infra.UserTestInfo;

import java.util.List;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/17 10:00
 */
public interface UserService {
    /**
     * 新增用户信息
     *
     * @param userTestInfo
     * @return Integer
     */
    Integer insertUser(UserTestInfo userTestInfo);

    /**
     * 删除用户信息
     *
     * @param userId
     * @return Integer
     */
    Integer delUser(Long userId);

    /**
     * 修改用户信息
     *
     * @param userTestInfo
     * @return Integer
     */
    Integer updateUser(UserTestInfo userTestInfo);

    /**
     * 查询用户信息
     *
     * @param userTestInfo
     * @return List<UserTestInfo>
     */
    List<UserTestInfo> selectUser(UserTestInfo userTestInfo);


}
