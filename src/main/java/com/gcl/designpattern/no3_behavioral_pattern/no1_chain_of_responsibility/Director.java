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
具体审批者 主任
 */
public class Director extends Leader {
    public Director(String name){
        super(name);
    }
    @Override
    public void handLeaveRequest(LeaveRequest request) {
        if(request.getLeaveDay() < 3){
            System.out.println("主任"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为"+request.getLeaveDay());
        }
        else {
            if(this.next != null){
                this.next.handLeaveRequest(request);
            }
        }

    }
}