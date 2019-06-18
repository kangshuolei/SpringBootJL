package com.xiaokang.demo.dao;

import com.xiaokang.demo.bean.Entrustment;
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
public interface EntrustmentMapper extends BaseMapper<Entrustment> {

    List<Entrustment> getAll();
    int UpdateAndDeleteEnt(Entrustment entrustment);

}
