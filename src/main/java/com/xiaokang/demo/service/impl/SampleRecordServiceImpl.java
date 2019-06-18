package com.xiaokang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaokang.demo.bean.SampleRecord;
import com.xiaokang.demo.bean.User;
import com.xiaokang.demo.dao.SampleRecordMapper;
import com.xiaokang.demo.service.SampleRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Service
public class SampleRecordServiceImpl extends ServiceImpl<SampleRecordMapper, SampleRecord> implements SampleRecordService {

    @Autowired
    SampleRecordMapper sampleRecordMapper;
    @Override
    public List<SampleRecord> getAll() {
        return sampleRecordMapper.getAll();
    }

    @Override
    public List<SampleRecord> getLsits(SampleRecord sampleRecord) {
        return sampleRecordMapper.getLsits(sampleRecord);
    }

    @Override
    public void deleteSample(SampleRecord sampleRecord) {
        sampleRecordMapper.deleteSample(sampleRecord);
    }

    @Override
    public SampleRecord selectById(Integer id) {
        return sampleRecordMapper.selectById(id);
    }

    @Override
    public void Addpicihao(SampleRecord sampleRecord) {
        sampleRecordMapper.updateById(sampleRecord);
    }


}
