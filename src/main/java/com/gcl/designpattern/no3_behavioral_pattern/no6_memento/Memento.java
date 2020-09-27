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


/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/14 18:42
 */

/**
 * Memento(备忘录）
 * 存储原发器的内部状态，根据原发器来决定保存哪些内部状态
 */
class Memento {
    private String account;
    private String password;
    private String telNo;

    public Memento(String account, String password, String telNo) {
        this.account = account;
        this.password = password;
        this.telNo = telNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}