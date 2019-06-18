package com.xiaokang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaokang.demo.bean.User;
import com.xiaokang.demo.dao.UserMapper;
import com.xiaokang.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xiaokang.demo.util.SecurityMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

        @Autowired
     UserMapper userMapper;

    @Override
    public boolean getUserByName(User user, HttpSession session) {

       user =  userMapper.selectOne(new QueryWrapper<User>().eq("username",user.getUsername())

                                                             .eq("password",SecurityMd5.encode(user.getPassword()))
                                                            .eq("state",000)

       );



        if (user != null) {
            session.setAttribute("currentUser", user);
            session.setAttribute("rank",user.getUserRank());

            return true;

        } else {
            return false;
        }
    }


    @Override
    public List<User> getAll() {
        List<User> all = userMapper.getAll();
        return all;
    }


    @Override
    public void addUser(User user) {
        String password = user.getPassword();
        user.setPassword(SecurityMd5.encode(password));
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(User user) {
         userMapper.deleteUser(user);
    }

    @Override
    public User selectbyId(Integer id) {
        return userMapper.selectbyId(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);

    }

    @Override
    public void resetUser(User user) {
        String password = user.getPassword();
        user.setPassword(SecurityMd5.encode(password));
        userMapper.updateById(user);
    }

    @Override
    public void ChangePwd(User user) {
        String password = user.getPassword();
        user.setPassword(SecurityMd5.encode(password));
        userMapper.ChangePwd(user);
    }


}
