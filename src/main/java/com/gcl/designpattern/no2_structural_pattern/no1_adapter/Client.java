/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/9 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no1_adapter;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/9 0:22
 */
public class Client {
    public static void main(String[] args) {
        Robot robot = new DogAdapter();
        robot.cry();
        robot.move();
    }
}