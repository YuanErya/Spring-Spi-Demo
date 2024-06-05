package com.ruayou.springspiimport.bean;

import javax.annotation.PostConstruct;

/**
 * @Author：ruayou
 * @Date：2024/6/5 23:23
 * @Filename：TwoBean
 */
public class TwoBean implements MyBean{
    @PostConstruct
    public void say(){
        System.out.println("TwoBean 成功加载！");
    }
}
