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
 * @date 2020/6/4 23:21
 */

/**
 * 抽象构件-Component
 * <p>
 * 变形金刚
 */
public interface Transform {
    //定义最基本的方法，无论怎么装饰，这个方法都会有,
    //即类图中的operator方法
    public void move();
}