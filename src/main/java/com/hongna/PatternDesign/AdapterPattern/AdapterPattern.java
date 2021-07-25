package com.hongna.PatternDesign.AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        new Adapter(new Speaker()).translate();
    }
}

class Speaker{
    //主持人进行文字的输出
    public String speak(){
        return "China no.1";
    };
}

//翻译
interface Translator{
    public String translate();
}

/**
 * 适配器模式和装饰器模式的区别在于
 * 适配器原有的功能已经足够强大，我们只是需要将其转换成其他类也能使用
 *
 */
class Adapter implements  Translator{
    private Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        String result = speaker.speak();
        //进行一些手语的输出，让其得到的值可以进行共用

        return null;
    }
}
