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
 * @date 2020/6/6 14:44
 */

/**
 * 客户端使用
 */
public class Client {
    public static void main(String[] args) {
        String black = "黑色";
        String white = "白色";

        ChessFactory factory = ChessFactory.getInstance();
        Chess chess = factory.getChess(black);
        chess.operation(new Local(1,2));
        Chess chess2 = factory.getChess(white);
        chess2.operation(new Local(3,5));
    }
}