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
 * Description:
 * 饿汉式2
 * 把实例化过程放到静态代码块中，本质上和EagerSingleton是一样的
 *
 * @author guchaolong
 * @date 2020/5/24 22:21
 */
public class EagerSingleton02 {
    private static EagerSingleton02 instance;

    static {
        instance = new EagerSingleton02();
    }

    private EagerSingleton02() {

    }

    public static EagerSingleton02 getInstance() {
        return instance;
    }
}