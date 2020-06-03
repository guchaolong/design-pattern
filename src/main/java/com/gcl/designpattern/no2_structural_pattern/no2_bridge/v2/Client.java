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
 * @date 2020/6/2 23:49
 */

/**
 * 使用
 */
public class Client {
    public static void main(String[] args) {
        Memory memory = new Memory32G();
        Phone phone = new HuaWei();
        phone.setMemory(memory);
        phone.buyPhone();
    }
}