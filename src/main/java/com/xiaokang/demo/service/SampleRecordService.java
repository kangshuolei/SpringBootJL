package com.xiaokang.demo.service;

import com.xiaokang.demo.bean.SampleRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
public interface SampleRecordService extends IService<SampleRecord> {
    List<SampleRecord> getAll();

    List<SampleRecord> getLsits(SampleRecord sampleRecord);

    void deleteSample(SampleRecord sampleRecord);

    SampleRecord selectById(Integer id);

    void Addpicihao(SampleRecord sampleRecord);

}
