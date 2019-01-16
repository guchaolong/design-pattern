/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/17 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no2_command;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/17 0:09
 */

/**
 * 命令发送者：遥控器
 */
public class Controller {
    private CommandInterface openCommand = new OpenCommand();
    private CommandInterface changeCommand = new ChangeCommand();
    private CommandInterface closeCommand = new CloseCommand();

    public void open(){
        openCommand.execut();
    }
    public void change(){
        changeCommand.execut();
    }
    public void close(){
        closeCommand.execut();
    }
}