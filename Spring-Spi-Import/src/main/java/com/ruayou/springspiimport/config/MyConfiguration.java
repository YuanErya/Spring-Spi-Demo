package com.ruayou.springspiimport.config;


import com.ruayou.springspiimport.selector.MySelector;

import org.springframework.context.annotation.Import;

/**
 * @Author：ruayou
 * @Date：2024/6/5 22:04
 * @Filename：MyConfiguration
 */
@Import(MySelector.class)
public class MyConfiguration {

}
