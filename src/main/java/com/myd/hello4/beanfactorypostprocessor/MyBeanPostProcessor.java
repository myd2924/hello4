package com.myd.hello4.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/19 13:49
 * @Description: BeanPostProcessor的使用
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof CalaServiceImpl){
            CalaServiceImpl calaService = (CalaServiceImpl)bean;
            calaService.setDesc("hahhaha");
            System.out.println("/****干啥子哟*//");
            return calaService;
        }
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof CalaServiceImpl){
            CalaServiceImpl calaService = (CalaServiceImpl)bean;
            calaService.setDesc("太嚣张了");
            return calaService;
        }
        return bean;
    }
}
