/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/2 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no2_bridge.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/2 23:35
 */

/**
 * 第二步：定义ConcreteImplementor，这里指具体的内存
 * 实现部分-16G
 */
public class Memory16G implements Memory {
    @Override
    public void addMemory() {
        System.out.println("手机安装16G内存");
    }
}