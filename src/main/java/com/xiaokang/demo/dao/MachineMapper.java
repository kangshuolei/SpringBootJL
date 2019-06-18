package com.xiaokang.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaokang.demo.bean.Machine;
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
public interface MachineMapper extends BaseMapper<Machine> {

    List<Machine> getAll();

    int updateAndDeleteById(Machine machine);

}
