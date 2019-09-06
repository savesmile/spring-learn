package com.flin.spring.java.headfirst.responsibility;

import com.flin.spring.java.headfirst.responsibility.exception.ChainProcessException;
import com.flin.spring.java.headfirst.responsibility.eg.Rule1;
import com.flin.spring.java.headfirst.responsibility.eg.Rule2;
import com.flin.spring.java.headfirst.responsibility.eg.Rule3;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装器
 *
 * @author F_lin
 * @since 2019/4/12
 **/
public class RulesWrapper {

    private static List<DefaultRule> rules = new ArrayList<>();

    {
        rules.add(new Rule1());
        rules.add(new Rule2());
        rules.add(new Rule3());
    }


    public void excute(Object params) {
        try {
            DefaultChain.of(rules).doChain(new TestContext(params));
        } catch (ChainProcessException ignore) {
            //异常反馈
        }
    }


}
