/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/4/18 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no10_template_method;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        BaseHookDemo hookDemo = new SubHookDemo();
        hookDemo.process();
    }
}