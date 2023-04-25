package com.woniuxy;

import com.woniuxy.entity.User;
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


}
