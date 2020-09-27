package com.gcl.designpattern.no1_creational_pattern.no4_builder.v2;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/27 22:37
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("sf", "sdf").setDisplay("sf").build();
        Computer2 computer2 = new Computer2.Builder().setCpu("df").build();
    }
}
