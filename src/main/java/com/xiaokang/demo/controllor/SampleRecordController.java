package com.xiaokang.demo.controllor;


import com.xiaokang.demo.bean.Msg;
import com.xiaokang.demo.bean.MsgList;
import com.xiaokang.demo.bean.SampleRecord;
import com.xiaokang.demo.bean.User;
import com.xiaokang.demo.service.SampleRecordService;
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
public class SampleRecordController {

    @Autowired
    SampleRecordService sampleRecordService;

    @RequestMapping("View_test_records")
    public String records(){
        return "/Data_Processing/Experimental_Record";
    }


    @RequestMapping("Error_Handling_List")
    public ModelAndView toAddUserPage() {
        ModelAndView mv = new ModelAndView("/Data_Processing/ErrorHandling");
        mv.addObject("sampleRecord",new SampleRecord());
        return mv;
    }

    @RequestMapping(value = "/getRowid/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getRowid(@PathVariable Integer id){
        SampleRecord sampleRecord = sampleRecordService.selectById(id);
        return Msg.success().add("sampleRecord",sampleRecord);
    }


    @RequestMapping("getExperimentalRecordList")
    @ResponseBody
    public Msg sampleRecord(){
        MsgList<SampleRecord> resultLsit = new MsgList<>();
        resultLsit.setRows(sampleRecordService.getAll());
        resultLsit.setTotal(100);
        return Msg.success().add("MsgList",resultLsit);
    }

    @RequestMapping("slects")
    @ResponseBody
    public Msg slects(SampleRecord sampleRecord){
        MsgList<SampleRecord> resultLsit = new MsgList<>();
        resultLsit.setRows(sampleRecordService.getLsits(sampleRecord));
        resultLsit.setTotal(100);
        return Msg.success().add("MsgList",resultLsit);
    }

    @RequestMapping(value = "/picihaoDelete/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg picihaoDelete(SampleRecord sampleRecord){
        MsgList<SampleRecord> resultList = new MsgList<>();
        sampleRecordService.deleteSample(sampleRecord);
        resultList.setRows(sampleRecordService.getLsits(sampleRecord));
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }

    @RequestMapping(value = "/picihaoupdate/{id}")
    public ModelAndView picihaoupdate(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("/Data_Processing/picihaoupdate");
        SampleRecord sampleRecord = sampleRecordService.selectById(id);
        mv.addObject("sampleRecord",sampleRecord);
        return mv;
    }

    @RequestMapping(value = "/Addpicihao/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Msg Addpicihao(SampleRecord sampleRecord){
        MsgList<SampleRecord> resultList = new MsgList<>();
        sampleRecordService.Addpicihao(sampleRecord);
        resultList.setRows(sampleRecordService.getLsits(sampleRecord));
        resultList.setTotal(100);
        return Msg.success().add("MsgList",resultList);
    }
}

