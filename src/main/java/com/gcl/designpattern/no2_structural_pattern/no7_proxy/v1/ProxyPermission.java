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
package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/13 3:45
 */
public class ProxyPermission implements AbstractPermission {
    private RealPermission permission = new RealPermission();
    private int level = 0;
    @Override
    public void modifyInfo() {
        if(0==level){
            System.out.println("对不起，您没有权限");
        }
        if(1 == level){
            permission.modifyInfo();
        }
    }

    @Override
    public void view() {
        System.out.println("代理对象的浏览");
    }

    @Override
    public void publish() {
        if(0==level){
            System.out.println("对不起 你没有权限");
        }
        if(1==level){
            permission.publish();
        }

    }

    @Override
    public void modifyNote() {
        if(0==level){
            System.out.println("对不起 你没有权限");
        }
        if(1==level){
            permission.publish();
        }

    }

    @Override
    public void setLevel(int level) {
        this.level = level;

    }
}