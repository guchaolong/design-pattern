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
 * @date 2019/1/11 1:05
 */
public class Client {
    public static void main(String[] args) {
        AbstractPlantFruit plantFruit = new Apple();
        plantFruit.add(new Banana());
        plantFruit.eat();

        AbstractPlantFruit plantFruit1 = new Plate();
        plantFruit1.add(new Apple());
        plantFruit1.add(new Banana());
        plantFruit1.eat();

    }
}