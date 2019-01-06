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
package com.gcl.designpattern.creational_pattern.no2_factory_method;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/6 23:36
 */
public class HaierTV implements TV {
    @Override
    public void play() {
        System.out.println("海尔电视播放中...");
    }
}