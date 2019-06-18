package com.xiaokang.demo.controllor;


import com.xiaokang.demo.bean.Msg;
import com.xiaokang.demo.bean.MsgList;
import com.xiaokang.demo.bean.User;
import com.xiaokang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-22
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/success")
    public String success() {
        return "Gmain";
    }

    /*登录*/
    @RequestMapping("login")
    @ResponseBody
    public Msg login(@RequestBody User user, HttpSession session){
        if (userService.getUserByName(user, session)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }

    }


    @RequestMapping("toMainPage")
    public ModelAndView toMainPage(HttpSession session) {
        ModelAndView mv;
        if (session.getAttribute("currentUser") != null && session.getAttribute("rank").equals("管理员") ) {
            mv = new ModelAndView("Gmain");
            mv.addObject("currentUser", session.getAttribute("currentUser"));
        }else if (session.getAttribute("currentUser") != null && session.getAttribute("rank").equals("普通用户")){
            mv = new ModelAndView("Pmain");
            mv.addObject("currentUser", session.getAttribute("currentUser"));
        }
        else  {
            mv = new ModelAndView("redirect:index");
        }
        return mv;
    }


    /*用户列表*/
    @RequestMapping("User_list")
    public String home_page(){
        return "/User_Management/UserList";
    }
    @RequestMapping("getUserList")
    @ResponseBody
    public Msg getHomePageList(){
        MsgList<User> resultList = new MsgList<>();
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

/*修改密码*/
@RequestMapping("Change_Password")
public ModelAndView Change_Password(HttpSession session) {

    ModelAndView mv = new ModelAndView("/User_Management/ChangePassword");
    mv.addObject("currentUser", session.getAttribute("currentUser"));
    mv.addObject("user", new User());
    return mv;
}



    /*添加用户*/
@RequestMapping("toAddUserPage")
public ModelAndView toAddUserPage() {
    ModelAndView mv = new ModelAndView("/User_Management/addUser");
    mv.addObject("user", new User());
    return mv;
}



    @RequestMapping("addUser")
    @ResponseBody
    public Msg addUser(User user){
        MsgList<User> resultList = new MsgList<>();
        userService.addUser(user);
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);

        return Msg.success().add("MsgList",resultList);
    }

    /*用户删除*/
    @RequestMapping(value = "/userDelete/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg userDelete(User user){
        MsgList<User> resultList = new MsgList<>();
        userService.deleteUser(user);
        System.out.println(user);
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "toupdateUserPage/{id}")
    public ModelAndView toModifyStudentPage(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("/User_Management/updateUser");
        User user = userService.selectbyId(id);
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "toresetPwd/{id}")
    public ModelAndView toresetPwd(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("/User_Management/resetUser");
        User user = userService.selectbyId(id);
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateUser(User user) {
        MsgList<User> resultList = new MsgList<>();
        userService.updateUser(user);
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "/resetUser/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg resetUser(User user) {
        MsgList<User> resultList = new MsgList<>();
        userService.resetUser(user);
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "/ChangePwd/{username}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg ChangePwd(User user) {
        MsgList<User> resultList = new MsgList<>();
        userService.ChangePwd(user);
        resultList.setRows(userService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }




}

