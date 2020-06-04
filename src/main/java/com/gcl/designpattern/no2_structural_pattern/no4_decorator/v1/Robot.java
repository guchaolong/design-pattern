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
 * @date 2020/6/4 23:33
 */

/**
 * 具体装饰类-ConcreteDecoratorA
 * 装饰成机器人
 */
public class Robot extends Changer {

    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成机器人");
    }

    //增加说话的功能
    public void say() {
        System.out.println("说话");
    }
}