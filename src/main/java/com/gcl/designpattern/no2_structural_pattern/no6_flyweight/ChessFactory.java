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

import java.util.ArrayList;

/**
 * 享元工厂角色
 * 存放了可以复用的对象（黑棋、白棋）
 * 提供获取方法
 */
public class ChessFactory {
    private ArrayList<Chess> qz;
    public ChessFactory()
    {
        qz=new ArrayList<Chess>();
        Chess w=new WhiteChess();
        qz.add(w);
        Chess b=new BlackChess();
        qz.add(b);
    }
    public Chess getChess(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (Chess)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (Chess)qz.get(1);
        }
        else
        {
            return null;
        }
    }
}