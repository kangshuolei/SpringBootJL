package com.xiaokang.demo.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.xiaokang.demo.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-22
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getAll();
    int deleteUser(User user);

    User selectbyId(Integer id);

    void ChangePwd(User user);



}
