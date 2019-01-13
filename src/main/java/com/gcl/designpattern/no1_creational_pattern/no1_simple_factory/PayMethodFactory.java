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
 * @date 2019/1/6 23:23
 */

/**
 *
 * 获得支付方式的工厂类，根据传入的参数获取相应的支付方式
 *
 * 如果新增支付方式，就需要修改这个工厂类（违法开闭原则）
 */
public class PayMethodFactory {
    public static AbstractPay getPay(String pay){
        if("cash".equals(pay)){
            return new CashPay();
        }else if("creditcard".equals(pay)){
            return new CreditcardPay();
        }
        return null;
    }
}