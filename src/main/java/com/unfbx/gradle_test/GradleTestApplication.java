package com.unfbx.gradle_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.unfbx.gradle_test.mapper")
public class GradleTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GradleTestApplication.class, args);
        Object jasyptStringEncryptor = run.getBean("lazyJasyptStringEncryptor");
        System.out.println(jasyptStringEncryptor.getClass());
    }

}
