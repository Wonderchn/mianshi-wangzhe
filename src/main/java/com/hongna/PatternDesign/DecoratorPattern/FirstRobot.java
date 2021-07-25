package com.hongna.PatternDesign.DecoratorPattern;

/**
 * 可以将其理解为第一代机器人
 */
public class FirstRobot implements Robot {
    @Override
    public void doSomething() {
        System.out.println("对话");
        System.out.println("唱歌");
    }
}



class RobotDecorator implements  Robot{
    private Robot robot;
    public RobotDecorator(Robot robot){
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
    }

    public void doMoreThing(){
        robot.doSomething();
        System.out.println("跳舞扫地");
    }
}
