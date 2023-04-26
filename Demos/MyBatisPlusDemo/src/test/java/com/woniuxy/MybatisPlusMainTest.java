package com.woniuxy;

import com.woniuxy.entity.User;
import com.woniuxy.entity.User2;
import com.woniuxy.mapper.User2Mapper;
import com.woniuxy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusMainTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void testUserMapper(){
        System.out.println( userMapper.queryAll() );

        System.out.println("-------------------------");


        User user = new User();
        user.setId(666L);
        user.setAge(18);
        user.setName("woniu");
        user.setEmail("woniu@woniuxy.com");

        userMapper.insert(user);

        System.out.println( userMapper.queryAll2() );

    }

    @Autowired
    User2Mapper user2Mapper;

    @Test
    void testUserMapper2(){

        User user = new User();
        user.setAge(18);
        user.setName("woniu2");
        user.setEmail("woniu@woniuxy2.com");

        userMapper.insert(user);


        User2 user2 = new User2();
        user2.setAge2(18);
        user2.setName2("woniu3");
        user2.setEmail2("woniu@woniuxy3.com");

        user2Mapper.insert(user2);
    }


}
