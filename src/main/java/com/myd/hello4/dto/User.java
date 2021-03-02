package com.myd.hello4.dto;

import com.myd.hello4.annotation.CheckAge;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 09:42
 * @Description:
 */
@CheckAge
@Data
public class User {

    @NotBlank
    private String name;

    private String phone;

    @NotNull(message = "age不能为空")
    private Integer age;
}
