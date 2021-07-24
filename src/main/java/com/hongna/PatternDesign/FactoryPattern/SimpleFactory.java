package com.hongna.PatternDesign.FactoryPattern;

public class SimpleFactory {
    public static Product createProduct(String type){
        if (type.equals("A")){
            return new ProductA();
        }
        else {
            return new ProductB();
        }
    }
}

abstract class Product{

}

class ProductA extends  Product{

}

class ProductB extends Product{

}
