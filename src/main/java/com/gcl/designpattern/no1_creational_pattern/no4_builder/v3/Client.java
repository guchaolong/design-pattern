/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/7 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no4_builder.v3;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/7 0:32
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilderA());
        Product p = director.construct();
        System.out.println(p);
    }
}