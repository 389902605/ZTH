package Test2;

public class Test {
    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.name="张三";
        husband.age=45;
        wife wife = new wife();
        husband.wf=wife;
        wife.name="李四";
        wife.age=18;
        wife.hb=husband;
        husband.show();
        wife.show1();
    }
}
