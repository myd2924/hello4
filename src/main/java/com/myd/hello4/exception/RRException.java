package com.myd.hello4.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 15:06
 * @Description: TODO
 */
@Getter
@Setter
public class RRException extends RuntimeException{

    private String msg;
    private int code = 500;

    public RRException(String msg){
        super(msg);
        this.msg = msg;
    }

    public RRException(String msg,int code){
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public RRException(String msg,Throwable e){
        super(msg,e);
        this.msg = msg;
    }

    public RRException(String msg,int code,Throwable e){
        super(msg,e);
        this.msg = msg;
        this.code = code;
    }
}
