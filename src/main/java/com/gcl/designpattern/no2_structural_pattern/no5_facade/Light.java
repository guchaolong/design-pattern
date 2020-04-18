/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/12 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no5_facade;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/12 19:25
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+"打开");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void off(){
        System.out.println(name + "关闭");
    }
}