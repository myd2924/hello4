package com.myd.hello4.controller;

import com.myd.hello4.dto.User;
import com.myd.hello4.exception.RRException;
import com.myd.hello4.util.ParamsUtil;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 10:03
 * @Description:
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login",consumes = "application/json")
    public String login(@Valid @RequestBody User user, BindingResult bindingResult){
        ParamsUtil.checkParm(bindingResult);
        /*if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            StringBuilder sb = new StringBuilder();
            sb.append("error:");
            for(ObjectError error:allErrors){
                sb.append("\n").append(error.getDefaultMessage());
            }
            throw new RRException(sb.toString()) ;
        }*/

        return "success";
    }

}
