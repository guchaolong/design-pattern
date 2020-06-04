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
package com.gcl.designpattern.no2_structural_pattern.no3_compose.v2;

import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 22:55
 */

/**
 * 叶子 构件
 */
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println("叶子构件业务方法执行中...");
    }

    @Override
    public void add(Component c) {
        System.out.println("实际开发中，这里要进行异常处理或错误提示，叶子不支持add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("实际开发中，这里要进行异常处理或错误提示，叶子不支持remove");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("实际开发中，这里要进行异常处理或错误提示，叶子不支持getChild");
        return null;
    }
}