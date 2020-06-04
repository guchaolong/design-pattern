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
 * @date 2020/6/4 23:37
 */

/**
 * 具体装饰类-ConcreteDecoratorB
 * 装饰成飞机
 */
public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机");
        fly();//
    }

    //增加飞翔功能
    public void fly() {
        System.out.println("飞翔");
    }
}