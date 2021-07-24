package com.hongna.PatternDesign.FactoryPattern.Factory;

/**
 * 通过工厂模式，我们实现通过同一个接口创建不同的工厂类，我们根据这个接口实现不同
 * 如果我们想要实现更多的产品，其实这个时候就是实现抽象工厂的设计模式
 */
public class Client {
    public static void main(String[] args) {
        IceCreamFactory factory = new AppleIceCreamFactory();
        IceCream iceCream = factory.createIceCream();
        iceCream.taste();

        factory = new BannanaIceCreamFactory();
        IceCream iceCream1 = factory.createIceCream();
        iceCream1.taste();

    }
}
