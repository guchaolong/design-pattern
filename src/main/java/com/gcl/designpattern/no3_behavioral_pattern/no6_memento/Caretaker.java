/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/14 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no6_memento;

import lombok.Data;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/14 18:44
 */

/**
 * Caretaker(负责人）
 * 负责人又称管理者，负责保存备忘录，但是不能对备忘录的内容进行操作或检查
 * 负责人中可以存储一个或多个备忘录对象，它只负责存储对象，不能修改对象，
 * 也无需知道对象的实现细节
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}