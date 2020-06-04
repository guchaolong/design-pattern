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

import javax.print.attribute.Size2DSyntax;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 23:06
 */

/**
 * 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        Component c1, c2, c3, c4;
        Composite s1, s2;

        c1 = new Leaf();
        c2 = new Leaf();
        c3 = new Leaf();
        c4 = new Leaf();

        s1 = new Composite();
        s2 = new Composite();

        s1.add(c1);
        s1.add(c2);
        s2.add(c3);
        s2.add(c4);
        s1.add(s2);

        //一致性，s1是Component的子类，无论它具体是什么类型，都有公共的operation方法
        s1.operation();
    }
}