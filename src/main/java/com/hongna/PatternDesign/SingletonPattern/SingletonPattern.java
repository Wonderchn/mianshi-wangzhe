package com.hongna.PatternDesign.SingletonPattern;

public class SingletonPattern {
    public static void main(String[] args) {

    }
}

class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){ };
    public static Singleton getInstance(){
        return singleton;
    }
}