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
package com.gcl.designpattern.no2_structural_pattern.no6.flyweight;

import java.awt.*;

/**
 * 白棋
 */
public class WhiteChess implements Chess {
    @Override
    public void downChess(Graphics graphics, Point pt) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(pt.x,pt.y,30,30);
    }
}