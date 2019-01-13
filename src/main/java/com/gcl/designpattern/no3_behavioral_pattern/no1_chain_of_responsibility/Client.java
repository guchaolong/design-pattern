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
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/14 0:35
 */
public class Client {
    public static void main(String[] args) {
        Leader director,manager;
        director = new Director("王主任");
        manager = new Manager("李经理");

        director.setNext(manager);//主任的下家是经理

        LeaveRequest request = new LeaveRequest("张三", 2);
        LeaveRequest request2 = new LeaveRequest("李四", 5);
        director.handLeaveRequest(request);
        director.handLeaveRequest(request2);
    }
}