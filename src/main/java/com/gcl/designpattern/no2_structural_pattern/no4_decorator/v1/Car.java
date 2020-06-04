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
 * @date 2020/6/4 23:24
 */

/**
 * 具体构件类-ConcreteComponent
 * 被装饰的最初的对象
 */
public class Car implements Transform {
    public Car() {
        System.out.println("原始对象：一辆汽车");
    }

    @Override
    public void move() {
        System.out.println("最初对象：只是一辆车子，在地上移动");
    }
}