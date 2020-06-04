/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/11 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no3_compose.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/11 0:57
 */
public class Apple extends AbstractPlantFruit {
    @Override
    void add(AbstractPlantFruit a) {
        System.out.println("抛出异常，因为我是苹果，不再是一个果盘");
    }

    @Override
    void remove(AbstractPlantFruit b) {
        System.out.println("抛出异常，因为我是苹果，不再是一个果盘");
    }

    @Override
    void getOne(AbstractPlantFruit c) {
        System.out.println("抛出异常，因为我是苹果，不再是一个果盘");
    }

    @Override
    void eat() {
        System.out.println("吃苹果");
    }
}