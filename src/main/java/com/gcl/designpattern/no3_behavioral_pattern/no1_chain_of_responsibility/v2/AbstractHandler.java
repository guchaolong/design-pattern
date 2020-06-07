/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: demo
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/7 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no1_chain_of_responsibility.v2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/7 15:06
 */

/**
 * 抽象处理类
 */
public abstract class AbstractHandler {
    //第一个handler
    public static AbstractHandler startHandler = new Handler1();
    //下一个handler
    private AbstractHandler nextHandler;

    //初始化处理链
    static {
        startHandler.setNextHandler(new Handler2())
                .setNextHandler(new Handler3());
    }

    //返回当前对象，可以链式调用
    private AbstractHandler setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
        return this.nextHandler;
    }

    protected void commonLog() {
        System.out.println(this.getClass().getName());
    }

    protected boolean needHandle(Request request) {
        return true;
    }

    protected void handle(Request r) {
        if (this.nextHandler != null) {
            this.nextHandler.handle(r);
        }
    }
}