package org.hzero.boot.user.app.service.impl;

import org.hzero.boot.user.app.service.UserService;
import org.hzero.boot.user.domain.UserTestInfoMapper;
import org.hzero.boot.user.infra.UserTestInfo;
import org.hzero.boot.user.infra.UserTestInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/17 10:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserTestInfoMapper userTestInfoMapper;

    @Override
    public Integer insertUser(UserTestInfo userTestInfo) {
        return userTestInfoMapper.insert(userTestInfo);
    }

    @Override
    public Integer delUser(Long userId) {
        return userTestInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public Integer updateUser(UserTestInfo userTestInfo) {
        return userTestInfoMapper.updateByPrimaryKey(userTestInfo);
    }

    @Override
    public List<UserTestInfo> selectUser(UserTestInfo userTestInfo) {
        UserTestInfoExample userTestInfoExample = new UserTestInfoExample();
        UserTestInfoExample.Criteria criteria = userTestInfoExample.createCriteria();
        if (userTestInfo.getUser_name() != null && !"".equals(userTestInfo.getUser_name())) {
            criteria.andUser_nameEqualTo(userTestInfo.getUser_name());
        }
        if (userTestInfo.getUser_sex() != null && !"".equals(userTestInfo.getUser_sex())) {
            criteria.andUser_sexEqualTo(userTestInfo.getUser_sex());
        }
        return userTestInfoMapper.selectByExample(userTestInfoExample);
    }
}
