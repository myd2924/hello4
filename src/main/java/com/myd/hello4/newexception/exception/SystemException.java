package com.myd.hello4.newexception.exception;

import com.myd.hello4.newexception.result.Result;
import lombok.Data;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:09
 * @Description: 系统异常
 */
@Data
public class SystemException extends BaseException {
    private Result result = new Result();

    public SystemException(Result result){
        super(result.getCode()+":"+result.getMsg());
        this.result = result;
    }

    public SystemException(String code,String msg,String success){
        super(code+":"+msg);
        this.result.setCode(code);
        this.result.setMsg(msg);
        this.result.setSuccess(success);
    }

    public SystemException(Result result,Throwable cause){
        super(result.getCode()+":"+result.getMsg(),cause);
        this.result = result;
    }

    public SystemException(String code, String msg, Throwable cause) {
        super(code + ":" + msg, cause);
        this.result.setCode(code);
        this.result.setMsg(msg);
    }
}
