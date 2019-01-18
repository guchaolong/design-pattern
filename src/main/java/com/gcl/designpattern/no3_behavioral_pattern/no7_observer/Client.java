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
 * @date 2019/1/19 1:06
 */
public class Client {
    public static void main(String[] args) {
        MySubject subject = new CatSubject();
        MyObserver dog1 = new DogObserver();
        MyObserver dog2 = new DogObserver();
        MyObserver mouce = new MouceObserver();

        subject.add(dog1);
        subject.add(dog2);
        subject.add(mouce);

        subject.update();

    }
}