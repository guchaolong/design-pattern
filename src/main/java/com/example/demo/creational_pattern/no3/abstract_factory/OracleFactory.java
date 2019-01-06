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
package com.example.demo.creational_pattern.no3.abstract_factory;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/7 1:24
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