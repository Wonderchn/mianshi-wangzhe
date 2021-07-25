package com.hongna.PatternDesign.StatePattern;

public class StatePattern {
    public static void main(String[] args) {
        Context ZhangSan = new Context();
        ZhangSan.changeState(new Happy());
        ZhangSan.doSomething();
        ZhangSan.changeState(new Angry());
        ZhangSan.doSomething();

    }
}

abstract class State{
    abstract void doWork();
}

class Happy extends State{

    @Override
    void doWork() {
        System.out.println("高兴上路");
    }
}

class Angry extends State{

    @Override
    void doWork() {
        System.out.println("无精打采");
    }
}

class Sad extends State{

    @Override
    void doWork() {
        System.out.println("啥也不干");
    }
}

class Context{
    private State state;
    public void changeState(State state){
       this.state = state;
    }
    public void doSomething(){
        state.doWork();
    }
}