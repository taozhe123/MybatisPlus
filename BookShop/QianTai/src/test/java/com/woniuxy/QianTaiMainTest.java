package com.woniuxy;

//import com.woniuxy.qiantai.controller.BooktypeController;
import com.woniuxy.servicelayer.service.BooktypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QianTaiMainTest {

    @Autowired
    BooktypeService booktypeService;
//
//    @Autowired
//    BooktypeController booktypeController;

    @Test
    void testGeneratorCode(){
        System.out.println( booktypeService.list() );
    }

}
