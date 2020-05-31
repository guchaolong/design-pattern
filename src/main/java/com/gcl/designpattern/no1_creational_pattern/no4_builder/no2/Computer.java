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
package com.gcl.designpattern.no1_creational_pattern.no4_builder.no2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/31 20:34
 */
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    //2、私有化造函数，参数为Builder类型
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    //1、静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中
    public static class Builder {
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选

        //3、Builder的构造函数，参数为Computer中必填的那些参数，cpu 和ram
        public Builder(String cup, String ram) {
            this.cpu = cup;
            this.ram = ram;
        }

        //4、设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        //5、build()方法，调用私有构造方法，在其中构建Computer的实例并返回
        public Computer build() {
            return new Computer(this);
        }
    }
}