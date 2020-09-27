package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v3;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/27 23:31
 */
public class Persion implements PersionInterface {
    @Override
    public void sayHello() {
        System.out.println("具体实现类的sayHello方法");
    }
}
