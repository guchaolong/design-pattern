/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/7 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no3_abstract_factory;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/7 1:26
 */
public class Client {
    public static void main(String[] args) {
        //连接数据库，需要connection statement,我不关心怎么产生，给我我需要的就行
        ConnectionAndStatementFactory factory = new OracleFactory();//给你一个工厂（ConnectionAndStatementFactory里定义了相关方法）
        Connection con = factory.getCon();//通过工厂给你一个connection
        Statement sta = factory.getSta();//通过工厂给你一个statement
        con.connection();//Oracle connection
        sta.statement();//Oracle statement
    }
}