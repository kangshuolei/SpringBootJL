package com.xiaokang.demo.service.impl;

import com.xiaokang.demo.bean.Sample;
import com.xiaokang.demo.dao.SampleMapper;
import com.xiaokang.demo.service.SampleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Service
public class SampleServiceImpl extends ServiceImpl<SampleMapper, Sample> implements SampleService {

}
