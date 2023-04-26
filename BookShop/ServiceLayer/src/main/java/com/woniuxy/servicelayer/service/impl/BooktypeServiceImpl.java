package com.woniuxy.servicelayer.service.impl;

import com.woniuxy.dal.entity.Booktype;
import com.woniuxy.dal.mapper.BooktypeMapper;
import com.woniuxy.servicelayer.service.BooktypeService;
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
public class BooktypeServiceImpl extends ServiceImpl<BooktypeMapper, Booktype> implements BooktypeService {

}
