package com.ruayou.springspienableautoconfiguration.config;

import com.ruayou.springspienableautoconfiguration.core.MyCore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：ruayou
 * @Date：2024/6/4 16:41
 * @Filename：MyEACAutoConfiguration
 */

public class MyEACAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MyCore myCore(){
        return new MyCore();
    }
}
