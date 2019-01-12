/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/12 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.structural_pattern.no5.Facade;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/12 19:30
 */
public class Facaed {
   private Light[] lights = new Light[2];
   private Air air;
   private Tv tv;

    public Facaed() {
        lights[0] = new Light("灯1");
        lights[1] = new Light("灯2");
        this.air = new Air();
        this.tv = new Tv();
    }

    public void on(){
        lights[0].on();
        lights[1].on();
        air.on();
        tv.on();
    }
    public void off(){
        lights[0].off();
        lights[1].off();
        air.off();
        tv.off();
    }
}