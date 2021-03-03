package com.myd.hello4.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 20:09
 * @Description: TODO
 */

public class TestT {

    public static <T> void fromTo1(T[] ar, Collection<T> co){
        for(T t:ar){
            co.add(t);
        }
    }


    public static <T> void fromTo2(Collection<? extends T> ar, Collection<T> co){
        for(T t:ar){
            co.add(t);
        }
    }

    public static void main(String[] args) {
        List<String> ar = new ArrayList<>();
        Collection<Object> co = new ArrayList<>();
        //下面代码将产生编译错误，传参类型不一致，编译器迷惑了
        //fromTo1(ar,co);
        fromTo2(ar,co);
        System.out.println(co);
    }

}
