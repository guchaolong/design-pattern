/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/5/31 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no1_creational_pattern.no4_builder.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/31 20:34
 */
public class Computer2 {
    private String cpu;//必须
    private String ram;//必须
    private int usbCount;//可选
    private String keyboard;//可选
    private String display;//可选

    //2、私有化造函数，只有内部类才能调用
    private Computer2() {
    }

    //1、静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中
    public static class Builder {
        //3、持有一个外部类的属性，调用外部类构造函数
        Computer2 computer2 = new Computer2();

        //4、设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
        public Builder setCpu(String cpu) {
            computer2.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            computer2.ram = ram;
            return this;
        }

        public Builder setUsbCount(int usbCount) {
            computer2.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            computer2.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            computer2.display = display;
            return this;
        }

        //5、build()方法
        public Computer2 build() {
            return computer2;
        }
    }
}