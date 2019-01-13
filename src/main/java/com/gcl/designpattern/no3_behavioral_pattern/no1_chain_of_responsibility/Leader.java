/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/14 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no1_chain_of_responsibility;

/**
抽象处理者
 */
public abstract class Leader {
    protected String name;
    protected Leader next;

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handLeaveRequest(LeaveRequest request);
}