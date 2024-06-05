package com.ruayou.springspiimport.config;

import com.ruayou.springspiimport.bean.MyBean;
import com.ruayou.springspiimport.selector.MySelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author：ruayou
 * @Date：2024/6/5 22:04
 * @Filename：MyConfiguration
 */
@Configuration
@Import(MySelector.class)
public class MyConfiguration {

}
