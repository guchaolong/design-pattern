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
package com.gcl.designpattern.structural_pattern.no2_bridge;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/10 1:31
 */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
    }
}