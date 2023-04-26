package com.woniuxy.servicelayer.service.impl;

import com.woniuxy.dal.entity.Role;
import com.woniuxy.dal.mapper.RoleMapper;
import com.woniuxy.servicelayer.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
