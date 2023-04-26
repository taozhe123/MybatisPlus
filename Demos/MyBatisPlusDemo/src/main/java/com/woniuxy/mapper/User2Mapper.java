package com.woniuxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniuxy.entity.User2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//public interface UserMapper {
public interface User2Mapper extends BaseMapper<User2> {  //MyBatisPlus通过BaseMapper扩展功能


}
