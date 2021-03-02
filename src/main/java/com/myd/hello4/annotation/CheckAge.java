package com.myd.hello4.annotation;

import com.myd.hello4.validate.CheckAgeValidate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 09:43
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Constraint(validatedBy = CheckAgeValidate.class)
public @interface CheckAge {
    String message() default "当phone不为空的时候，age字段必须大于18";

    Class<?>[] groups() default {};

    Class<?extends Payload>[] payload() default {};
}
