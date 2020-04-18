/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/4/18 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no10_template_method;

/**
 * 模板方法模式
 * 抽象父类定义一个操作中算法的骨架，将一些步骤延迟到子类实现
 */
public abstract class BaseHookDemo {
    /**
     * 第一步 获取数据
     */
    public abstract void getData();

    /**
     * 第二步 转换数据
     */
    public void convertData(){
        System.out.println("通用转换数据方法");
    }

    /**
     * 第三步 显示数据
     */
    public abstract void displayData();

    /**
     * 模板方法
     */
    public void process(){
        getData();
        if(isValid()){
            convertData();
        }
        displayData();
    }

    public boolean isValid(){
        return false;
    }
}