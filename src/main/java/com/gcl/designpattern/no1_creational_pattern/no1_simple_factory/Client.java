/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/6 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no1_simple_factory;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/6 23:25
 */

/**
 * 获取一个抽象类型的支付方式，传入参数 取得相应的具体支付方式
 */
public class Client {
    public static void main(String[] args) {
        AbstractPay pay = PayMethodFactory.getPay("cash");
        pay.pay();
    }
}