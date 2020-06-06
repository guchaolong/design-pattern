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
package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 19:45
 */

/**
 * 代理主题角色-Proxy
 * 时间代理类，包含了对真实主题角色的引用
 */
public class LiuDeHuaTimeProxy implements Star {
    //被代理对象
    private Star star;

    public LiuDeHuaTimeProxy(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("before time:" + System.currentTimeMillis());
        star.sing();
        System.out.println("end time:" + System.currentTimeMillis());
    }

    @Override
    public void dance() {
        System.out.println("before time:" + System.currentTimeMillis());
        star.dance();
        System.out.println("end time:" + System.currentTimeMillis());
    }
}