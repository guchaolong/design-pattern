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
package com.gcl.designpattern.no2_structural_pattern.no3_compose.v3;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 22:51
 */

/**
 * 抽象构件
 * 安全组合模式：抽象构件中只定义公共的业务方法，
 * 操作子构件的add、remove、getChild等方法留到了容器构件中实现
 */
public abstract class Component {
    //共有的业务逻辑方法
    public abstract void operation();
}