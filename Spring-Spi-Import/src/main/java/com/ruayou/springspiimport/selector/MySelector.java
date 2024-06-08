package com.ruayou.springspiimport.selector;

import com.ruayou.springspiimport.bean.MyBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author：ruayou
 * @Date：2024/6/5 23:21
 * @Filename：MySelector
 */
public class MySelector implements ImportSelector {

    //返回值全类名
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<MyBean> myBeans = SpringFactoriesLoader.loadFactories(MyBean.class, this.getClass().getClassLoader());
        if(myBeans==null|| myBeans.isEmpty()){
            return new String[0];
        }
        int size = myBeans.size();
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i]=myBeans.get(i).getClass().getName();
        }
        return strings;
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return ImportSelector.super.getExclusionFilter();
    }
}
