package com.xiaokang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.xiaokang.demo.bean.NetworkStatus;
import com.xiaokang.demo.dao.NetworkStatusMapper;
import com.xiaokang.demo.service.NetworkStatusService;
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
public class NetworkStatusServiceImpl extends ServiceImpl<NetworkStatusMapper, NetworkStatus> implements NetworkStatusService {

    @Autowired
    NetworkStatusMapper networkStatusMapper;


    @Override
    public List<NetworkStatus> getAll() {
        return networkStatusMapper.getAll();
    }
}
