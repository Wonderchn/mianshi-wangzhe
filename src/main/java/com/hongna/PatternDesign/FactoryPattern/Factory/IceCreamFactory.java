package com.hongna.PatternDesign.FactoryPattern.Factory;


/**
 * 工厂接口
 * 具体工厂实现这个接口，我们可以实现工厂创建自己特有的产品
 *
 */
public interface IceCreamFactory {
    public IceCream createIceCream();
}
