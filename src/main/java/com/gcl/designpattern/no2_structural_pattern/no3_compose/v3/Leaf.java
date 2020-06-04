/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/3 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no3_compose.v3;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 22:55
 */

/**
 * 叶子 构件
 * 只需要实现抽象构件中定义的公共方法
 * 本来叶子构件就不应该包含add、remove等操作
 */
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println("叶子构件业务方法执行中...");
    }
}