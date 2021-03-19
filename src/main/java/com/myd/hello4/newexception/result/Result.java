package com.myd.hello4.newexception.result;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:06
 * @Description: 全系统返回格式
 */
@Data
@Builder
public class Result<T> implements Serializable{
    private static final long serialVersionUID = -4899657898007859361L;

    /**
     * 成功 失败
     */
    private String success;
    /**
     * 编码
     */
    private String code;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public Result(){}

    public Result(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
