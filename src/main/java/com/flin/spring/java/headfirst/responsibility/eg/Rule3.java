package com.flin.spring.java.headfirst.responsibility.eg;

import com.flin.spring.java.headfirst.responsibility.Chain;
import com.flin.spring.java.headfirst.responsibility.DefaultRule;
import com.flin.spring.java.headfirst.responsibility.TestContext;

/**
 * @author F_lin
 * @since 2019/4/12
 **/
public class Rule3 implements DefaultRule {
    @Override
    public void process(TestContext context, Chain chain) {
        System.out.println("rule3 process chain");
    }

    @Override
    public boolean judge(TestContext context) {
        return false;
    }

    @Override
    public String getTag() {
        return "rule3";
    }
}
