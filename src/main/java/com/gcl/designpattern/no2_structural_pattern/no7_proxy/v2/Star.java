/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/6 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no2_structural_pattern.no7_proxy.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/6 19:42
 */

/**
 * 抽象主题角色-Subject
 * 申明了真实主题和代理主题的共同接口，这样依赖任何使用真实主题的地方都
 * 可以使用代理主题。
 * 客户端需要针对抽象主题角色进行编程
 */
public interface Star {
    void sing();
    void dance();
}
