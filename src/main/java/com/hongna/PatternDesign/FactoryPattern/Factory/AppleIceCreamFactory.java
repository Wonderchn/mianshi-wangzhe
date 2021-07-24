package com.hongna.PatternDesign.FactoryPattern.Factory;

public class AppleIceCreamFactory implements IceCreamFactory {

    @Override
    public IceCream createIceCream() {
        return new AppleIceCream();
    }
}
