package com.shuzhou.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.shuzhou.domain.User;

import java.util.List;

/**
 * Created by lufei on 18/4/9.
 */
@Mapper
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);
    /**
     * 查询用户列表
     * @return
     */
    List<User> findAllUser();
}
