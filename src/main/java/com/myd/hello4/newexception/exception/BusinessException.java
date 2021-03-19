package com.myd.hello4.newexception.exception;

import com.myd.hello4.newexception.result.Result;
import lombok.Data;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:11
 * @Description: 业务异常
 */
@Data
public class BusinessException extends BaseException {

    private Result result = new Result();

    public BusinessException(Result result) {
        super(result.getCode()+ ":" + result.getMsg());
        this.result = result;
    }

    public BusinessException(String code, String msg) {
        super(code + ":" + msg);
        this.result.setCode(code);
        this.result.setMsg(msg);
    }

    public BusinessException(Result result, Throwable cause) {
        super(result.getCode() + ":" + result.getMsg(), cause);
        this.result = result;
    }

    public BusinessException(String code, String msg, Throwable cause) {
        super(code + ":" + msg, cause);
        this.result.setCode(code);
        this.result.setMsg(msg);
    }
}
