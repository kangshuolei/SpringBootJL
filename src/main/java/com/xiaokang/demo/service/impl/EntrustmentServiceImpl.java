package com.xiaokang.demo.service.impl;

import com.xiaokang.demo.bean.Entrustment;
import com.xiaokang.demo.dao.EntrustmentMapper;
import com.xiaokang.demo.service.EntrustmentService;
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
public class EntrustmentServiceImpl extends ServiceImpl<EntrustmentMapper, Entrustment> implements EntrustmentService {

    @Autowired
    EntrustmentMapper entrustmentMapper;
    @Override
    public List<Entrustment> getAll() {
        return entrustmentMapper.getAll();
    }

    @Override
    public void addEntrustment(Entrustment entrustment) {
        entrustmentMapper.insert(entrustment);
    }

    @Override
    public int UpdateAndDeleteEnt(Entrustment entrustment) {
        return entrustmentMapper.UpdateAndDeleteEnt(entrustment);
    }


}
