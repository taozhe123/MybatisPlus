package com.woniuxy.servicelayer.service.impl;

import com.woniuxy.dal.entity.Address;
import com.woniuxy.dal.mapper.AddressMapper;
import com.woniuxy.servicelayer.service.AddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
