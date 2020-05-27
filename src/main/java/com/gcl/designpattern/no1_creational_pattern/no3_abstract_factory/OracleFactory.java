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
 * @date 2019/1/7 1:24
 */

/**
 * 具体工厂
 */
public class OracleFactory implements ConnectionAndStatementFactory {
    @Override
    public Connection getCon() {
        return new OracleConnection();
    }

    @Override
    public Statement getSta() {
        return new OracleStatement();
    }
}