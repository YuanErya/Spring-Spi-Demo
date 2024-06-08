package com.ruayou.springspitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 空项目，用于测试添加依赖之后能否正常注入。
 * @author yuaner
 */
@SpringBootApplication
public class SpringSpiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSpiTestApplication.class, args);
    }

}
