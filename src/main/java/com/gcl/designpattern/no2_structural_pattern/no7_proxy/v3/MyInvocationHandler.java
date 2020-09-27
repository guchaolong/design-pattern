package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/27 23:26
 */
public class MyInvocationHandler implements InvocationHandler {

    private PersionInterface persionInterface;

    public MyInvocationHandler(PersionInterface persionInterface){
        this.persionInterface = persionInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sayHello")) {
            System.out.println("sayHello方法 开始");
        }
        method.invoke(persionInterface, args);
        if (method.getName().equals("sayHello")) {
            System.out.println("sayHello方法 结束");
        }
        return null;
    }
}
