package com.myd.hello4.importbeandefinitionregistrar.scanner;

import com.myd.hello4.importbeandefinitionregistrar.annotation.MyBean;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/22 14:05
 * @Description: 定义一个扫描器 指定需要扫描的标识
 */
public class MyClassPathDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public MyClassPathDefinitionScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
        super(registry, useDefaultFilters);
    }

    /**
     * @addIncludeFilter 将自定义的注解添加到扫描任务中
     * @addExcludeFilter 将带有自定义注解的类，不加载到容器中
     */
    public void registerFilter(){
        addIncludeFilter(new AnnotationTypeFilter(MyBean.class));
        //addExcludeFilter(new AnnotationTypeFilter(MyBean.class));
    }

    @Override
    public Set<BeanDefinitionHolder> doScan(String ...basePackages){
        return super.doScan(basePackages);
    }



}
