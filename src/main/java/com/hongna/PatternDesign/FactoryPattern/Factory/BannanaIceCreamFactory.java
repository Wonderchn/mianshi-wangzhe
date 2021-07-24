package com.hongna.PatternDesign.FactoryPattern.Factory;

public class BannanaIceCreamFactory  implements  IceCreamFactory{
    @Override
    public IceCream createIceCream() {
        return  new BannanaIceCream();
    }
}
