package com.myd.hello4.controller;

import com.myd.hello4.exception.RRException;
import com.myd.hello4.response.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 15:58
 * @Description:
 */

@RestController
@RequestMapping("/execption")
public class TestExecptionController {

    @RequestMapping("/test1")
    public R testExecption(){

       throw  new RRException("hahah");

    }
    @RequestMapping("/test2")
    public R test2(){
        return R.ok().data("好的呀");
    }
}
