package com.woniuxy.mapper;

import com.woniuxy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryAll();


}