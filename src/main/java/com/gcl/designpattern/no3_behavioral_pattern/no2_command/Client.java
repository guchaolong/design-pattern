/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/17 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no2_command;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/17 0:16
 */
public class Client {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.open();
        controller.change();
        controller.close();
    }
}