/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/13 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no7.proxy;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/13 3:50
 */
public class Client {
    public static void main(String[] args) {
        AbstractPermission proxy = new ProxyPermission();
        proxy.modifyInfo();
        proxy.view();
        proxy.publish();

    }
}