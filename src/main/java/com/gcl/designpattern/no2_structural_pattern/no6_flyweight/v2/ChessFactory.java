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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 14:31
 */

/**
 * 享元工厂类
 */
public class ChessFactory {
    private static ChessFactory INSTANCE;

    private ChessFactory() {
    }

    private ConcurrentHashMap<String, Chess> chessMap;//共享池

    //双重锁单例模式获取棋子工厂类
    public static ChessFactory getInstance() {
        if (INSTANCE == null) {
            synchronized (ChessFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ChessFactory();
                }
            }
        }
        return INSTANCE;
    }

    public Chess getChess(String color) {
        if (!chessMap.containsKey(color)) {
            chessMap.put(color, new Chess(color));
        }
        return chessMap.get(color);
    }
}