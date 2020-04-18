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
package com.gcl.designpattern.no1_creational_pattern.no4_builder;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/7 2:15
 */

//服务员 （指挥者）
public class KFCWaiter {
    private MealBuilder mb;

    public void setMb(MealBuilder mb) {
        this.mb = mb;
    }
    public Meal construct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}