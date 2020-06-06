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
 * @date 2020/6/6 19:43
 */

/**
 * 真实主题角色-RealSubject
 * 实现了真实的业务操作，客户端可以通过代理主题角色间接调用真实
 * 主题角色中定义的方法
 */
public class LiuDeHua implements Star, Player {
    @Override
    public void sing() {
        System.out.println("liu de hua sing...");
    }
    @Override
    public void dance() {
        System.out.println("liu de hua dancing");
    }

    @Override
    public void play() {
        System.out.println("liu de hua playing");
    }
}