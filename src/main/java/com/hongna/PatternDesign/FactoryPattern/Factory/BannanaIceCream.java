package com.hongna.PatternDesign.FactoryPattern.Factory;

public class BannanaIceCream implements IceCream {
    @Override
    public void taste() {
        System.out.println("这是香蕉味的冰淇淋");
    }
}
