/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/6 1.0          guchaolong          Creation File
 */
package com.example.demo.creational_pattern.no2_factory_method;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/6 23:40
 */
public class HisenseTVFactory implements TVFactory {
    @Override
    public TV getTv() {
        return new HisenseTV();
    }
}