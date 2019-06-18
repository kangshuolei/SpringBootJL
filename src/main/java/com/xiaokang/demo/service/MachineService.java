package com.xiaokang.demo.service;

import com.xiaokang.demo.bean.Machine;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
public interface MachineService extends IService<Machine> {

  List<Machine> getAll();

  int updateAndDeleteById(Machine machine);

  void addMachine(Machine machine);

}
