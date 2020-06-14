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
 * @date 2020/6/14 18:37
 */

/**
 * Originator(原发器）
 * 需要被恢复某个状态的对象
 */
public class UserInfoDTO {
    private String account;
    private String password;
    private String telNo;

    public Memento saveMemento(){
        return new Memento(account, password, telNo);
    }

    public void restoreMemento(Memento memento){
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.telNo = memento.getTelNo();
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

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}