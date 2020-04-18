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
 * @date 2019/1/7 1:25
 */
public class MysqlFactory implements ConnectionAndStatementFactory {
    @Override
    public Connection getCon() {
        return new MysqlConnection();
    }

    @Override
    public Statement getSta() {
        return new MysqlStatement();
    }
}