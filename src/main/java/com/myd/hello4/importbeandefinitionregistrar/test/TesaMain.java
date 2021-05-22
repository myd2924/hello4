package com.myd.hello4.importbeandefinitionregistrar.test;

import com.myd.hello4.hanlder.MyInvocationHanlder;
import com.myd.hello4.importbeandefinitionregistrar.config.MyConfigImport;
import com.myd.hello4.testbean.InterTest;
import com.myd.hello4.testbean.Test03;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/22 14:26
 * @Description:
 */
public class TesaMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigImport.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (int i=0;i<beanDefinitionNames.length;i++){
            System.out.println(beanDefinitionNames[i]);
        }

        InterTest test03 = (InterTest)Proxy.newProxyInstance(Test03.class.getClassLoader(), Test03.class.getInterfaces(), new MyInvocationHanlder(new Test03()));

        test03.print();
    }
}
