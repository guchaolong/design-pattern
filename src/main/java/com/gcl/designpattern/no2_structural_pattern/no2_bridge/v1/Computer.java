/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/10 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no2_bridge.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/10 1:21
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void info(){
        this.info();
    }
}