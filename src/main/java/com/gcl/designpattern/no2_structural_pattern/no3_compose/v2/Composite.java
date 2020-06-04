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

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/3 22:59
 */

/**
 * 容器构件
 */
public class Composite extends Component {

    //持有一个元素为抽象构件的list
    private List<Component> child = new ArrayList<>();

    //遍历list,客户端操作一个Component时，会迭代调用
    @Override
    public void operation() {
        for (Component obj : child) {
            obj.operation();
        }
    }

    @Override
    public void add(Component c) {
        child.add(c);
    }

    @Override
    public void remove(Component c) {
        child.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return child.get(i);
    }
}