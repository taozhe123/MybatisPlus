package com.woniuxy;

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

        System.out.println( userMapper.queryAll2() );
    }


}
