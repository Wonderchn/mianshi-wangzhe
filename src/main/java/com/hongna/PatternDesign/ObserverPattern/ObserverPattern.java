package com.hongna.PatternDesign.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//观察者模式
//定义对象间一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象接的到通知并被自动更新。

public class ObserverPattern {
    public static void main(String[] args) {
        Debit zhangsan = new Zhangsan();
        zhangsan.borrow(new WangWu());
        //有钱了 还钱
        zhangsan.notifyCredits();
    }
}

interface Debit{
    void borrow(Credit credit);
    void notifyCredits();
}

class Zhangsan implements Debit{
    private List<Credit> allCredit = new ArrayList<>();
    private Integer state = 0; //1表示有钱

    @Override
    public void borrow(Credit credit) {
        allCredit.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredit.forEach(credit -> credit.takeMoney());
    }

}

interface Credit{
    void takeMoney();
}
class WangWu implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("王五有钱咯");
    }
}