/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/6 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 19:58
 */
public class Client2 {
    public static void main(String[] args) {
        Star star = new LiuDeHua();
        // 在工程中保存jdk生成的代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        /**
         * 使用JDK动态代理生产动态代理类
         * Proxy.newProxyInstance
         * 第一个参数，classLoader 直接使用真实对象的classLoader就行
         * 第二个参数，实现的接口，
         * 第三个对象，调用处理，真正的逻辑就写在此处，还是调用真实对象的方法
         */
        Star o = (Star) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("liu de hua " + method.getName() + " start, time:" + System.currentTimeMillis());
                        Object result = method.invoke(star, objects);
                        System.out.println("liu de hua " + method.getName() + " end, time:" + System.currentTimeMillis());
                        return result;
                    }
                });
        o.sing();
        o.dance();
        Player p = (Player) o;
        p.play();
    }
}