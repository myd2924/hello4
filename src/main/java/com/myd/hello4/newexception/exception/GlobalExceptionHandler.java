package com.myd.hello4.newexception.exception;

import com.myd.hello4.newexception.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:13
 * @Description: 全局异常处理器
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity busniessExceptionHandler(BusinessException busniessException){
        Result result = new Result();
        return ResponseEntity.ok(result);
    }
}
