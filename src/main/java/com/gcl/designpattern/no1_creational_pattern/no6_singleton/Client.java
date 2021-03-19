/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/7 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no6_singleton;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/7 23:16
 */
public class Client {
    public static void main(String[] args) {
        EagerSingleton o1 = EagerSingleton.getInstance();
        EagerSingleton o2 = EagerSingleton.getInstance();
        System.out.println(o1==o2);

        LazySingleton o3 = LazySingleton.getInstance();
        LazySingleton o4 = LazySingleton.getInstance();
        System.out.println(o3==o4);

        //枚举实现单例
        SingletonEnum.INSTANCE.doSomething();

        EagerSingletonReadConfig cof = EagerSingletonReadConfig.getInstance();
        System.out.println("单例读取配置" + cof.getName());


    }
}