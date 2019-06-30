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
 * Description:
 *
 * @author guchaolong
 * @date 2019/6/30 9:20
 */
public class BlackChess implements Chess {
    @Override
    public void downChess(Graphics g, Point pt)
    {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}