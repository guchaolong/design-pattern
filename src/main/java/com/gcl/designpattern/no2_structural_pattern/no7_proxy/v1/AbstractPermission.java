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
 * @date 2019/1/13 3:41
 */
public interface AbstractPermission {
    public void modifyInfo();

    public void view();

    public void publish();

    public void modifyNote();

    public void setLevel(int level);
}
