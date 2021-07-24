package com.hongna.PatternDesign.SingletonPattern;

/**
 * 懒汉式实现
 * 在类加载的时候，立刻进行实例化
 */
public class SingletonPattern3 {
    public static void main(String[] args) {

    }
}

class Singleton3{
    private static Singleton3 singleton = new Singleton3();
    private Singleton3(){};
    public synchronized static Singleton3 getInstance(){
        if (singleton == null){
            singleton = new Singleton3();
        }
        return singleton;
    }
}
