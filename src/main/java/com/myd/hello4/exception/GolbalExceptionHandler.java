package com.myd.hello4.exception;

import com.myd.hello4.response.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 10:53
 * @Description: 全局于异常处理
 */
//@ControllerAdvice
@RestControllerAdvice
@Slf4j
public class GolbalExceptionHandler {

    /**
     * 应用到所有@RequestMapping注解方法 在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder){
        log.info("binder.getFieldDefaultPrefix {}"+binder.getFieldDefaultPrefix());
        log.info("binder.getFieldMarkerPrefix {}"+binder.getFieldMarkerPrefix());
    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttrebutes(Model model){
        model.addAttribute("auther","myd");
    }

    @ExceptionHandler(RRException.class)
    public R apiException(RRException ex){
        log.error("apiException 异常抛出：{}", ex);
        return R.error();
    }
}
