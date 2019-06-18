package com.xiaokang.demo.controllor;


import com.xiaokang.demo.bean.*;
import com.xiaokang.demo.service.EntrustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Controller
public class EntrustmentController {
    @Autowired
    EntrustmentService entrustmentService;
    @RequestMapping("Order_form")
    public String home_page(){
        return "/Data_Management/OrderForm";
    }

    @RequestMapping("getOrderFormList")
    @ResponseBody
    public Msg getOrderFormList(){
        MsgList<Entrustment> resultList = new MsgList<>();
        resultList.setRows(entrustmentService.getAll());
        resultList.setTotal(99);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping("insertOrder")
    @ResponseBody
    public Msg  insertOrder(Entrustment entrustment){
        MsgList<Entrustment> resultList = new MsgList<>();
        entrustmentService.addEntrustment(entrustment);
        resultList.setRows(entrustmentService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "/deleteRow/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg UpdateAndDeleteEnt(Entrustment entrustment){
        MsgList<Entrustment> resultList = new MsgList<>();
        entrustmentService.UpdateAndDeleteEnt(entrustment);
        resultList.setRows(entrustmentService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }



   @RequestMapping("/toAddOrderPage/{sampleBatch}")
   public ModelAndView toAddOrderPage(@PathVariable Integer sampleBatch){
       ModelAndView mv = new ModelAndView("/Data_Management/AddOrderForm");
       mv.addObject("sampleBatch",sampleBatch);
       return mv;
   }
}

