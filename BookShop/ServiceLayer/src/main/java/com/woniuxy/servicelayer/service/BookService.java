package com.woniuxy.servicelayer.service;

import com.woniuxy.dal.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
public interface BookService extends IService<Book> {

    List<Book> topN(Integer n);

    List<Book> listByType(Long typeId);
}
