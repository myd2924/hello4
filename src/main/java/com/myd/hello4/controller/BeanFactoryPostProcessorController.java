package com.myd.hello4.controller;

import com.myd.hello4.beanfactorypostprocessor.CalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/19 11:03
 * @Description:
 */
@Controller
@RequestMapping("/postProcess")
public class BeanFactoryPostProcessorController {

    @Autowired
    private CalaService calaService;

    @RequestMapping("/add/{a}/{b}")
    @ResponseBody
    public String getDesc(@PathVariable("a") String a,@PathVariable("b") String b){
        int add = calaService.add(Integer.valueOf(a), Integer.valueOf(b));
        return String.valueOf(add)+":"+calaService.getDesc();
    }
}
