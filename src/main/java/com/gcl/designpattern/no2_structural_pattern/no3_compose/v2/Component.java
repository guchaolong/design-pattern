/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/3 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no3_compose.v2;

import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 22:51
 */

/**
 * 抽象构件
 */
public abstract class Component {
    //共有的业务逻辑方法
    public abstract void operation();

    //添加子构件
    public abstract void add(Component c);

    //移除子构件
    public abstract void remove(Component c);

    //获取子构件
    public abstract Component getChild(int i);
}