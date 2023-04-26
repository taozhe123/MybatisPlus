package com.woniuxy.qiantai.controller;


import com.woniuxy.dal.entity.Booktype;
import com.woniuxy.servicelayer.service.BooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
@RestController
@RequestMapping("/booktype")
public class BooktypeController {

    @Autowired
    BooktypeService booktypeService;


    /**
     * 查询所有图书类型
     *
     * @return
     */
    @RequestMapping("all")
    public List<Booktype> all(){
        return booktypeService.list();
    }



}

