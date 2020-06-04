/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/4 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no4_decorator.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/4 23:27
 */

/**
 * 抽象装饰器类-Decorator
 */
public class Changer implements Transform {
    //聚合，维护一个指向抽象构件类型的引用（要被装饰的对象）
    private Transform transform;

    //构造方法
    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();//并未真正实现，而是调用被装饰对象的方法
    }
}