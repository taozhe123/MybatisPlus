package com.woniuxy.servicelayer.service.impl;

import com.woniuxy.dal.entity.Manager;
import com.woniuxy.dal.mapper.ManagerMapper;
import com.woniuxy.servicelayer.service.ManagerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内部员工信息 服务实现类
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

}
