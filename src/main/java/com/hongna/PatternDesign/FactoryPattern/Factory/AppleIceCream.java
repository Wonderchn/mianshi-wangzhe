package com.hongna.PatternDesign.FactoryPattern.Factory;

public class AppleIceCream implements IceCream {
    @Override
    public void taste() {
        System.out.println("这是苹果味的冰淇淋");
    }
}
