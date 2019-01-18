/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/19 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no7_observer;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/19 1:05
 */
public class DogObserver implements MyObserver {
    @Override
    public void update() {
        System.out.println("狗跑了---");
    }
}