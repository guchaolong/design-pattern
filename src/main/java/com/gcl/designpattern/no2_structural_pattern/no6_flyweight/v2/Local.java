/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/6 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no6_flyweight.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 14:23
 */

/**
 * 外部状态-位置
 */
public class Local {
    private int x;
    private int y;

    public Local(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Local{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}