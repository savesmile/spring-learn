package com.flin.spring.java.headfirst.factory.multiple;

import com.flin.spring.java.headfirst.factory.Fruit;
import com.flin.spring.java.headfirst.factory.fruitimpl.Peach;

/**
 * <p>
 *
 * @author F_Lin fengjunlin@modnim.com
 * @date 2019/9/6 10:06
 **/
public class PeachFruitManor implements MultipleFruitManor {
    @Override
    public Fruit cultivateFruit() {
        return new Peach();
    }
}
