package com.woniuxy.qiantai.controller;


import com.woniuxy.dal.entity.Book;
import com.woniuxy.servicelayer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

//    @RequestMapping()  //接收任意方式的请求
//    @GetMapping //仅接受get请求
    @PostMapping("topN")  //仅接受Post请求
    public List<Book> topN(Integer N){

        return bookService.topN(N);
    }




}

