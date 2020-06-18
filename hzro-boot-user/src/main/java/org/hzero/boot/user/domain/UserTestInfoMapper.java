package org.hzero.boot.user.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.hzero.boot.user.infra.UserTestInfo;
import org.hzero.boot.user.infra.UserTestInfoExample;
@Mapper
public interface UserTestInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTestInfo record);

    int insertSelective(UserTestInfo record);

    List<UserTestInfo> selectByExample(UserTestInfoExample example);

    UserTestInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTestInfo record);

    int updateByPrimaryKey(UserTestInfo record);
}