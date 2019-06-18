package com.xiaokang.demo.controllor;


import com.xiaokang.demo.bean.Machine;
import com.xiaokang.demo.bean.Msg;
import com.xiaokang.demo.bean.MsgList;
import com.xiaokang.demo.bean.User;
import com.xiaokang.demo.service.MachineService;
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
public class MachineController {

    @Autowired
    MachineService machineService;


    @RequestMapping("Machine_management")
    public String MachineManagement(){
        return "/User_Management/MachineManagement";
    }

    @RequestMapping("getMachineList")
    @ResponseBody
    public Msg getMachineList(){
        MsgList<Machine> resultList = new MsgList<>();
        resultList.setRows(machineService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "machineDelete/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg machineDelete(Machine machine){
        MsgList<Machine> resultList = new MsgList<>();
        machineService.updateAndDeleteById(machine);
        resultList.setRows(machineService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping("toAddMachinePage")
    public ModelAndView toAddMachinePage() {
        ModelAndView mv = new ModelAndView("/User_Management/addMachine");
        mv.addObject("machine", new Machine());
        return mv;
    }

    @RequestMapping("AddMachine")
    @ResponseBody
    public Msg addMachine(Machine machine){
        MsgList<Machine> resultList = new MsgList<>();
        machineService.addMachine(machine);
        resultList.setRows(machineService.getAll());
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }


}

