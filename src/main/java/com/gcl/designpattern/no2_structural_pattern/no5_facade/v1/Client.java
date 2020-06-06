/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/12 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no5_facade.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/12 19:37
 */
public class Client {
    public static void main(String[] args) {
        Facaed facaed = new Facaed();
        System.out.println("打开");
        facaed.on();
        System.out.println("关闭");
        facaed.off();
    }
}