package com.myd.hello4.importbeandefinitionregistrar.config;

import com.myd.hello4.importbeandefinitionregistrar.registrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/22 14:23
 * @Description:
 */
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
@ComponentScan("com.myd.hello4.importbeandefinitionregistrar")
public class MyConfigImport {
}
