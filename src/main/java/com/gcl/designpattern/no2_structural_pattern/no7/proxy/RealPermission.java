/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/13 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no7.proxy;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/13 3:43
 */
public class RealPermission implements AbstractPermission {
    @Override
    public void modifyInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    public void view() {
        System.out.println("浏览");
    }

    @Override
    public void publish() {
        System.out.println("发布新帖");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改发帖内容");
    }

    @Override
    public void setLevel(int level) {
        System.out.println("设置权限等级");
    }
}