package com.xiaokang.demo.dao;

import com.xiaokang.demo.bean.NetworkStatus;
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
public interface NetworkStatusMapper extends BaseMapper<NetworkStatus> {
    List<NetworkStatus> getAll();
}
