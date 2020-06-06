/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/5 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no5_facade.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/5 23:47
 */

/**
 * 外观类
 */
public class Facade {
    public void doSomething() {
        //由外观类来和子系统交互，细节对客户端不可见
        SubSystemA a = new SubSystemA();
        SubSystemB b = new SubSystemB();
        SubSystemC c = new SubSystemC();
        a.doSomething();
        b.doSomething();
        c.doSomething();
    }
}