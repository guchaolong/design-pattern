/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/5/24 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no6_singleton;

/**
 * Description:加载外部类时不会加载内部类，这样可以实现懒加载
 *
 * @author guchaolong
 * @date 2020/5/24 22:31
 */
public class LazySingleton02 {

    private LazySingleton02() {

    }

    /**
     * 私有静态内部类
     */
    private static class SingletonHolder {
        private final static LazySingleton02 instance = new LazySingleton02();
    }

    public static LazySingleton02 getInstance() {
        return SingletonHolder.instance;
    }
}