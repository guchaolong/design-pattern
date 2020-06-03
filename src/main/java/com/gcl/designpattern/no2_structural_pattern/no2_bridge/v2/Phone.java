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
 * @date 2020/6/2 23:40
 */

/**
 * 第三步：定义Abstraction手机抽象类
 */
public abstract class Phone {
    //使用聚合的方式，把内存部分包含进来
    Memory memory;

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    abstract void buyPhone();
}