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
 * 不仅可以实现单例，还可以防止反序列化
 * <p>
 * 在effective java（这本书真的很棒）中说道，最佳的单例实现模式就是枚举模式。
 * 利用枚举的特性，让JVM来帮我们保证线程安全和单一实例的问题。除此之外，写法还特别简单
 * <p>
 * 直接通过Singleton.INSTANCE.doSomething()的方式调用即可。方便、简洁又安全
 *
 * @author guchaolong
 * @date 2020/5/24 22:40
 */
public enum SingletonEnum {
    //
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }
}