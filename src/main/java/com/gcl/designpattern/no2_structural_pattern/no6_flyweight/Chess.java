/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/6/30 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no6_flyweight;

import java.awt.*;

/**
 * Description:抽象享元角色：棋子，根据颜色只有黑棋和白棋两种
 * 预先定义好可以复用黑棋和白棋两个对象，不用每次创建新对象
 * 棋子的其他属性 如位置等，这些可以通过参数传递到落子方法里
 */
public interface Chess {
    void downChess(Graphics graphics, Point point);
}
