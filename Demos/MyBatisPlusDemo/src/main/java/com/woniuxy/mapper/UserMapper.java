package com.woniuxy.mapper;

import com.woniuxy.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryAll();

//    @Update()
//    @Delete()
//    @Insert()
    @Select("select * from user")
    List<User> queryAll2();


}
