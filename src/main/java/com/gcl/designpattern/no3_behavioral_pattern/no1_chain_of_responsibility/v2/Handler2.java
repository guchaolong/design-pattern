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
 * @date 2020/6/7 15:07
 */
public class Handler2 extends AbstractHandler {
    @Override
    public boolean needHandle(Request request) {
        return request.getState().equals("handle2");
    }

    @Override
    protected void handle(Request request) {
        if(needHandle(request)){
            System.out.println("handler2 ...................");
            request.setState("handle3");
        }
        super.handle(request);
    }
}