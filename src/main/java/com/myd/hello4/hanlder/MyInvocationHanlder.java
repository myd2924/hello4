package com.myd.hello4.hanlder;

import com.myd.hello4.testbean.Test03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/22 16:29
 * @Description:
 */
public class MyInvocationHanlder implements InvocationHandler {

    private Test03 target;

    public MyInvocationHanlder(Test03 target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
