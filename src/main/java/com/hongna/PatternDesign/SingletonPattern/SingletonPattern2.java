package com.hongna.PatternDesign.SingletonPattern;

//懒汉式实现
//在类加载的时候 立刻进行实例化
public class SingletonPattern2 {
    public static void main(String[] args) {

    }
}
class Singleton2{
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){};
    public synchronized static Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}