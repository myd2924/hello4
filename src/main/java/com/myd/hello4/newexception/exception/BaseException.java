package com.myd.hello4.newexception.exception;

import java.io.Serializable;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:09
 * @Description: 异常基类
 */
public class BaseException extends RuntimeException implements Serializable{
    private static final long serialVersionUID = 7822883704521317919L;

    public BaseException(){}

    public BaseException(String msg){
        super(msg);
    }

    public BaseException(Throwable cause){
        super(cause);
    }

    public BaseException(String msg,Throwable cause){
        super(msg,cause);
    }

}
