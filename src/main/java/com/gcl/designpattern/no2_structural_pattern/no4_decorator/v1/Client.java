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
 * @date 2020/6/4 23:40
 */

/**
 * 客户端使用
 */
public class Client {
    public static void main(String[] args) {
        Transform t = new Car();//要被装饰的对象
        t.move();//最基本的方法

        Robot c = new Robot(t);//装饰成机器人
        c.move();
        c.say();//因为装饰成机器人了，有了说话的功能

        Airplane a = new Airplane(c);//装饰成飞机
        a.move();
        a.fly();

    }
}