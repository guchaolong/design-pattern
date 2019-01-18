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
 * @date 2019/1/19 0:58
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色 被观察者
 */
public abstract class MySubject {
    protected List list = new ArrayList();

    public void add(MyObserver observer) {
        list.add(observer);
    }
    public void delete(MyObserver observer){
        list.remove(observer);
    }
    public abstract void update();
}