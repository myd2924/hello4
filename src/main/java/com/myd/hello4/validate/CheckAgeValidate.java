package com.myd.hello4.validate;

import com.myd.hello4.annotation.CheckAge;
import com.myd.hello4.dto.User;
import com.myd.hello4.newexception.exception.BusinessException;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 09:46
 * @Description:
 */
public class CheckAgeValidate implements ConstraintValidator<CheckAge,Object> {

    String msg ;

    @Override
    public void initialize(CheckAge constraintAnnotation) {
        msg = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object t, ConstraintValidatorContext context) {
        if(t instanceof User){
            User user = (User)t;
            if(!StringUtils.isEmpty(user.getPhone())){
                if(user.getAge() == null || user.getAge() <= 18){
                    return false;
                }
            }
        }

        return true;
    }
}
