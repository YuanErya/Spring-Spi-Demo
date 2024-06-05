package com.ruayou.springspiimport.bean;

import javax.annotation.PostConstruct;

/**
 * @Author：ruayou
 * @Date：2024/6/5 23:22
 * @Filename：OneBean
 */
public class OneBean implements MyBean{

    @PostConstruct
    public void say(){
        System.out.println("OneBean 成功加载！");
    }
}
