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
 * @date 2019/1/14 0:23
 */

/**
 * 请假类
 */
public class LeaveRequest {
    private String leaveName;
    private int leaveDay;

    public LeaveRequest(String leaveName, int leaveDay) {
        this.leaveName = leaveName;
        this.leaveDay = leaveDay;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }
}