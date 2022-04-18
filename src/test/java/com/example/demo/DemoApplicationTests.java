package com.example.demo;

import com.example.demo.dao.ProductDao;
import com.example.demo.domain.product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ProductDao productDao;

    @Test
    void contextLoads() {
        System.out.println(productDao.selectList(null));
    }

    @Test
    void contextLoads2() {
        System.out.println(productDao.selectById(1));
    }

}
