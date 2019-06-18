package com.xiaokang.demo.controllor;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Controller
public class WireDataController {

    @RequestMapping("wire_rope")
    public String WireData(){
        return "/Data_Management/wireRope";
    }
}

