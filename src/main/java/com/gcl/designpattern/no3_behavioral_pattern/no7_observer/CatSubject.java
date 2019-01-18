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
 * @date 2019/1/19 1:02
 */
public class CatSubject extends MySubject {
    @Override
    public void update() {
        System.out.println("猫叫了-----------------------");
        for (Object obj : list){
            ((MyObserver)obj).update();
        }
    }
}