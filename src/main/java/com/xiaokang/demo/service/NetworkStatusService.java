package com.xiaokang.demo.service;

import com.xiaokang.demo.bean.NetworkStatus;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
public interface NetworkStatusService extends IService<NetworkStatus> {

    List<NetworkStatus> getAll();
}
