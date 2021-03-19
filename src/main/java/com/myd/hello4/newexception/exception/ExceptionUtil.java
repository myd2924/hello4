package com.myd.hello4.newexception.exception;

import com.myd.hello4.newexception.error.PropertitesUtils;
import com.myd.hello4.newexception.result.Result;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:12
 * @Description: 异常工具类
 */
public class ExceptionUtil {

    public static BusinessException businessException(String errCode){
        return new BusinessException(createResult(errCode));
    }

    private static Result createResult(String errCode){
        return new Result(errCode,getErrorMsg(errCode));
    }

    private static String getErrorMsg(String errCode) {
        return PropertitesUtils.getProperties(errCode);
    }
}
