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
 * @date 2019/1/7 23:13
 */

/**
 * 饿汉式
 *
 * 加载EagerSingleton类时就会生成
 */
public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}