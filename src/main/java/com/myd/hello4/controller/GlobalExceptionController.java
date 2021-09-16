package com.myd.hello4.controller;

import com.myd.hello4.exception.RRException;
import com.myd.hello4.response.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/6/10 17:20
 * @Description:
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionController {

    @ExceptionHandler(RRException.class)
    public R RRExceptionHandler(HttpServletRequest request,RRException ex){
        System.out.println("==============》封装异常");
        return R.error(ex.getCode(),ex.getMsg());
    }

}
