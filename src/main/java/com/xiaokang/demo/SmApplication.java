package com.xiaokang.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.xiaokang.demo.dao")
@SpringBootApplication
public class SmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmApplication.class, args);
    }

}
