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
package com.gcl.designpattern.no3_behavioral_pattern.no4_iterator;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/18 0:02
 */
public interface IIterator {
    boolean isFirst();

    boolean isLast();

    Object current();

    void previous();

    void next();
}
