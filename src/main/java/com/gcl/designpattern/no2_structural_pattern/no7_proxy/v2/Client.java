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
 * @date 2020/6/6 19:47
 */
public class Client {
    public static void main(String[] args) {
        Star star = new LiuDeHua();
        Star proxy = new LiuDeHuaTimeProxy(star);
        proxy.sing();
        proxy.dance();
    }
}