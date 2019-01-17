/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/18 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no3_iterator;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/18 0:15
 */
public class Client {
    public static void main(String[] args) {
        ITV itv = new Tv();
        IIterator iIterator = itv.getIterator();
        while (!iIterator.isLast()){
            System.out.println(iIterator.current().toString());
            iIterator.next();
        }
    }
}