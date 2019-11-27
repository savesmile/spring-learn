package com.flin.spring.java.multithreading;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author F_lin
 * @since 2019/4/8
 **/
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("eg", "eg");

    }

}
