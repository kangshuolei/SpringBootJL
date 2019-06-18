package com.xiaokang.demo.dao;

import com.xiaokang.demo.bean.SampleRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
public interface SampleRecordMapper extends BaseMapper<SampleRecord> {

    List<SampleRecord> getAll();
    List<SampleRecord> getLsits(SampleRecord sampleRecord);

    int deleteSample(SampleRecord sampleRecord);
    SampleRecord selectById(Integer id);


}
