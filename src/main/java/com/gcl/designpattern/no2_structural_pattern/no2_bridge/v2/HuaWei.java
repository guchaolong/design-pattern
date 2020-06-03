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
 * @date 2020/6/2 23:46
 */

/**
 * 第四步：定义Refined Abstraction（具体的手机品牌）
 */
public class HuaWei extends Phone {
    @Override
    void buyPhone() {
        memory.addMemory();
        System.out.println("购买了华为手机，内存为" + getMemory());
    }
}