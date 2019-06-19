package com.f_lin.example.core.aop.tests;

import org.springframework.stereotype.Component;

/**
 * @author F_lin
 * @since 2019/4/15
 **/
@Component
public class Cat {
    private String name;

    public void say() {
        System.out.println("miaomiaomiao");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
