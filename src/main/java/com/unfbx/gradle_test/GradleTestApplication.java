package com.unfbx.gradle_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unfbx.gradle_test.mapper")
public class GradleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleTestApplication.class, args);
    }

}
