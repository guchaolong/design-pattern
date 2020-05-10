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
 * @date 2019/1/7 23:17
 */

/**
 * 懒汉式
 * 第一次调用getInstance()方法时才生成
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    /**
     * 加上synchronized，防止多线程同时首次访问,因为是加在方法上，效率不高
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双重检查 性能较高
     * @return
     */
    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}