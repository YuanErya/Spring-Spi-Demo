package com.ruayou.springspienableautoconfiguration.core;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * @Author：ruayou
 * @Date：2024/6/4 16:42
 * @Filename：MyCore
 */
@Component
public class MyCore  {

    /**
     * 如果这个组件被正常注册到容器内部
     * 那么就会触发下满控制台输出
     */
    @PostConstruct
    public void coreMethod(){
        System.out.println("MyCore 通过EnableAutoConfiguration 方式加载！");
    }

}
