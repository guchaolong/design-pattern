/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/11 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.structural_pattern.no3.compose;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/11 0:52
 */

/**
 * 果盘中有苹果、梨子、香蕉等具体的水果，同时可能还有一个小果盘，小果盘中也有水果
 *
 * 抽象类
 * 假设既可能是水果（可以eat()),也可能是果盘（可以add()、remove()。。。）
 *
 */
public abstract class AbstractPlantFruit {
    abstract void add(AbstractPlantFruit a);

    abstract void remove(AbstractPlantFruit b);

    abstract void getOne(AbstractPlantFruit c);

    abstract void eat();
}