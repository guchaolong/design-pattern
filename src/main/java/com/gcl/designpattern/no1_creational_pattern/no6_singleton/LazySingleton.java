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
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    /**
     * 非线程安全
     *
     * @return
     */
    public static LazySingleton getInstance0() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 加上synchronized，防止多线程同时首次访问,因为是加在方法上，效率不高
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双重检查 性能较高 DCL (double check lock)
     * volatile一定要加
     * 因为存在指令重排序
     * 如：
     * instance = new LazySingleton();
     * 创建对象的时候 分配内存，赋默认值(半成品）->调用构造函数赋值-> 给栈用的引用instance赋值
     * 重排序后:赋默认值(半成品）->给栈用的引用instance赋值->调用构造函数赋值
     * 还没有真正调用构造函数，instance已经不为null了，线程2进来就能直接拿到instance了，但这个instance只是个半成品，后续使用就会有问题
     *
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