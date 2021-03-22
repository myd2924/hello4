package com.myd.hello4.importbeandefinitionregistrar.registrar;

import com.myd.hello4.importbeandefinitionregistrar.scanner.MyClassPathDefinitionScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/22 13:57
 * @Description: 测试动态注入Bean到Spring容器中
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar,ResourceLoaderAware,BeanFactoryAware {

    private ResourceLoader resourceLoader;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        MyClassPathDefinitionScanner scanner = new MyClassPathDefinitionScanner(registry,false);
        scanner.setResourceLoader(resourceLoader);
        scanner.registerFilter();
        scanner.doScan("com.myd.hello4.testbean");
    }

    /**
     * 获取spring的一些元数据
     * @param resourceLoader
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
