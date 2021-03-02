package com.myd.hello4.validate;

import com.myd.hello4.annotation.CheckAge;
import com.myd.hello4.dto.User;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 09:46
 * @Description:
 */
public class CheckAgeValidate implements ConstraintValidator<CheckAge,User> {

    @Override
    public void initialize(CheckAge constraintAnnotation) {

    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if(!StringUtils.isEmpty(user.getPhone())){
            if(user.getAge() == null){
                return false;
            }
            if(user.getAge() <= 18){
                return false;
            }
        }
        return true;
    }
}
