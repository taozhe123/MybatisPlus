package com.woniuxy.servicelayer.service.impl;

import com.woniuxy.dal.entity.RoleUrlPermission;
import com.woniuxy.dal.mapper.RoleUrlPermissionMapper;
import com.woniuxy.servicelayer.service.RoleUrlPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与菜单、接口权限的对应关系 服务实现类
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
@Service
public class RoleUrlPermissionServiceImpl extends ServiceImpl<RoleUrlPermissionMapper, RoleUrlPermission> implements RoleUrlPermissionService {

}
