/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/5 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no5_facade.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/5 23:41
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSomething();
    }
}