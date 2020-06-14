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
 * @date 2020/6/14 18:49
 */
public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        user.setAccount("oldAccount");
        user.setPassword("oldPassword");
        user.setTelNo("oldTelNo");
        System.out.println(user);

        Caretaker caretaker = new Caretaker();
        Memento memento = user.saveMemento();
        caretaker.setMemento(memento);

        user.setAccount("newAccount");
        user.setPassword("newPassword");
        user.setTelNo("newTelNo");
        System.out.println(user);

        user.restoreMemento(caretaker.getMemento());
        System.out.println(user);

    }

}