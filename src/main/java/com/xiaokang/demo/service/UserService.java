package com.xiaokang.demo.service;

import com.xiaokang.demo.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-22
 */
public interface UserService extends IService<User> {

    boolean getUserByName(User user, HttpSession session);

    List<User> getAll();


    void addUser(User user);


    void deleteUser(User user);

    User selectbyId(Integer id);



    void updateUser(User user);

    void resetUser(User user);

    void ChangePwd(User user);
}
