package com.woniuxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniuxy.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
//public interface UserMapper {
public interface UserMapper extends BaseMapper<User> {  //MyBatisPlus通过BaseMapper扩展功能

    List<User> queryAll();

//    @Update()
//    @Delete()
//    @Insert()
    @Select("select * from user")
    List<User> queryAll2();


}
