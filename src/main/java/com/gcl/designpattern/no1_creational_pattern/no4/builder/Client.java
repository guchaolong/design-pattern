/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/7 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no4.builder;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/7 2:17
 */
public class Client {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();
        MealBuilder mb = new AMealBuilder();
        waiter.setMb(mb);

        waiter.construct();


    }
}