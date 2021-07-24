package com.hongna.PatternDesign.FactoryPattern.Factory;


/**
 *  这个类代表产品类的大类，我们这个代表了各个产品所具有的共性
 *  我们通过继承这个类实现各种工厂特有的产品。
 *
 */
public interface IceCream {
    public void taste();
}

