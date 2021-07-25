package com.hongna.PatternDesign.FacadePattern;

public class FacadePattern {
    public static void main(String[] args) {
        new Facade().prove();
    }
}

class SubFlow1{
    boolean isTrue(){
        return true;
    }
}

class SubFlow2{
    boolean isOk(){
        return true;
    }
}

class SubFlow3{
    boolean isGoodMan(){
        return true;
    }
}

class Facade{
    SubFlow1 s1 = new SubFlow1();
    SubFlow2 s2 = new SubFlow2();
    SubFlow3 s3 = new SubFlow3();
    boolean prove(){
        return s1.isTrue()&& s2.isOk() && s3.isGoodMan();
    }
}