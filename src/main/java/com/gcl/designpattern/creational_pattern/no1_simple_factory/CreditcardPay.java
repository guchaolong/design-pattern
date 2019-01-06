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
package com.gcl.designpattern.creational_pattern.no1_simple_factory;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/6 23:22
 */
//具体的支付方式
public class CreditcardPay extends AbstractPay {
    @Override
    public void pay() {
        System.out.println("信用卡支付");
    }
}