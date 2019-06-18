package com.xiaokang.demo.service;

import com.xiaokang.demo.bean.Entrustment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaokang.demo.bean.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
public interface EntrustmentService extends IService<Entrustment> {
    List<Entrustment> getAll();

    void addEntrustment(Entrustment entrustment);

    int UpdateAndDeleteEnt(Entrustment entrustment);

}
