package com.xiaokang.demo.controllor;


import com.xiaokang.demo.bean.Msg;
import com.xiaokang.demo.bean.MsgList;
import com.xiaokang.demo.bean.NetworkStatus;
import com.xiaokang.demo.service.NetworkStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Controller
public class NetworkStatusController {
    @Autowired
    NetworkStatusService networkStatusService;

    @RequestMapping("home_page")
    public String home_page(){
        return "/Data_Management/HomePage";
    }
    @RequestMapping("getHomePageList")
    @ResponseBody
    public Msg getHomePageList(){
        MsgList<NetworkStatus> resultList = new MsgList<>();
        resultList.setRows(networkStatusService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

}

