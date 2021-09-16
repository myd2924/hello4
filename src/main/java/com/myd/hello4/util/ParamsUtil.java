package com.myd.hello4.util;

import com.myd.hello4.exception.RRException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/9/15 16:37
 * @Description:
 */
public class ParamsUtil {

    public static void checkParm(BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            String messages = bindingResult.getAllErrors()
                    .stream()
                    .map(ObjectError::getDefaultMessage)
                    .reduce((m1, m2) -> m1 + "；" + m2)
                    .orElse("参数输入有误！");
            throw new RRException(messages);
        }
    }
}
