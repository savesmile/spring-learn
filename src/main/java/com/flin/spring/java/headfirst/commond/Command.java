package com.flin.spring.java.headfirst.commond;

/**
 * 命令
 * <p>
 *
 * @author F_Lin fengjunlin@modnim.com
 * @date 2019/9/6 14:57
 **/
public interface Command {

    default void execute() {
        getInvoker().invoke();
    }

    Invoker getInvoker();
}
