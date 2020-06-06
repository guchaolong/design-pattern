/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/6 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no6_flyweight.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 14:22
 */

/**
 * 享元类
 */
public class Chess {
    //内部状态（可以共享的）
    private String color;

    //可以共享的内部状态 作为构造函数的参数
    public Chess(String color) {
        this.color = color;
    }

    //业务方法-在local位置落子
    public void operation(Local local) {
        System.out.println("棋子颜色：" + color + " 落子位置：" + local);
    }
}