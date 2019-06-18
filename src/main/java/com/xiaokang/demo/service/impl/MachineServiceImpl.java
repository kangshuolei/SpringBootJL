package com.xiaokang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaokang.demo.bean.Machine;
import com.xiaokang.demo.dao.MachineMapper;
import com.xiaokang.demo.service.MachineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@Service
public class MachineServiceImpl extends ServiceImpl<MachineMapper, Machine> implements MachineService {

    @Autowired
    MachineMapper machineMapper;

    @Override
    public List<Machine> getAll() {
        return machineMapper.getAll();
    }

    @Override
    public int updateAndDeleteById(Machine machine) {
        return machineMapper.updateAndDeleteById(machine);
    }

    @Override
    public void addMachine(Machine machine) {
        machineMapper.insert(machine);
    }
}
