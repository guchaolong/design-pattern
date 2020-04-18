/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/4/18 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no10_template_method;

/**
 *
 */
public class SubHookDemo extends BaseHookDemo {
    @Override
    public void getData() {
        System.out.println("子类自己获取数据");
    }

    @Override
    public void displayData() {
        System.out.println("子类自己的显示数据的方法");

    }

    @Override
    public boolean isValid() {
        return true;
    }
}