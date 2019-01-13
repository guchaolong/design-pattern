/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/9 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no1_adapter;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/9 0:20
 */
public class DogAdapter extends Dog implements Robot  {

    @Override
    public void cry() {
        wang();
    }

    @Override
    public void move() {
        run();
    }
}