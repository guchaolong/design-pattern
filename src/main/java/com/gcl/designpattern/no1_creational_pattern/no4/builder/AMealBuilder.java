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
 * @date 2019/1/7 2:13
 */
//A套餐的组装过程
public class AMealBuilder extends MealBuilder {
    @Override
    public void buildFood() {
        System.out.println("套餐A 的食物。。。");
    }

    @Override
    public void buildDrink() {
        System.out.println("套餐A 的饮料");
    }

}