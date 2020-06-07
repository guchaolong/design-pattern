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
package com.gcl.designpattern.no3_behavioral_pattern.no1_chain_of_responsibility.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/14 0:33
 */
public class Manager extends Leader {
    public Manager(String name){
        super(name);
    }

    @Override
    public void handLeaveRequest(LeaveRequest request) {
        if(request.getLeaveDay() < 10){
            System.out.println("经理"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为"+request.getLeaveDay());
        }
        else {
            if(this.next != null){
                this.next.handLeaveRequest(request);
            }
        }

    }
}