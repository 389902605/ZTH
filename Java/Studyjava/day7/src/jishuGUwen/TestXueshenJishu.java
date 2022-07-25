package jishuGUwen;

public class TestXueshenJishu {
    public static void main(String[] args) {
        Xuanyuan one = new Xuanyuan();
        JiShuGuWen two = new JiShuGuWen();
        one.name = "123";
        one.hobby = "打篮球";
        one.cla = 1;
        one.age = 123;
        one.say();
        two.JiaoLing = 12;
        two.Iesson = "Java";
        two.FangXiang = "Java";
        two.name = "123";
        two.say();
    }
}
