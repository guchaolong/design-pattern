/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/11 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no3_compose;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/11 1:01
 */
public class Plate extends AbstractPlantFruit {
    private ArrayList list = new ArrayList();
    @Override
    void add(AbstractPlantFruit a) {
        list.add(a);
    }

    @Override
    void remove(AbstractPlantFruit b) {
        list.remove(b);
    }

    @Override
    void getOne(AbstractPlantFruit c) {
        list.get(1);
    }

    @Override
    void eat() {
        for (Object obj : list){
            ((AbstractPlantFruit)obj).eat();
        }
    }


}