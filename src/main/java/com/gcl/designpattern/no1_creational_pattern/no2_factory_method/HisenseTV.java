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
package com.gcl.designpattern.no1_creational_pattern.no2_factory_method;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/6 23:37
 */
public class HisenseTV implements TV {
    @Override
    public void play() {
        System.out.println("海信电视播放中...");
    }
}