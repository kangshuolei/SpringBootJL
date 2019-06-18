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
public class WireRopeController {

    @RequestMapping("Wire_Report")
    public String WireRope(){
        return "/Data_Management/WireReport";
    }
    @RequestMapping("Report_statistics")
    public String ReportStatistics(){
        return "/User_Management/ReportStatistics";
    }
}

