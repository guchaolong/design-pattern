package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/27 23:20
 */
public class Main {
    public static void main(String[] args) {
        PersionInterface p = new Persion();
        PersionInterface o = (PersionInterface) Proxy.newProxyInstance(p.getClass().getClassLoader(),
                new Class[]{PersionInterface.class}, new MyInvocationHandler(p));
        o.sayHello();

    }
}
