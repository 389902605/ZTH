package cn.banyuan.hello;

public class Test_9 {
    public static void main(String[] args) {
        int mc = 13;
        switch (mc){
            case 1:
                System.out.println("奖励夏令营");
                break;
            case 2:
                System.out.println("奖励电脑");
                break;
            case 3:
                System.out.println("奖励硬盘");
                break;
            default:
                System.out.println("无");
                break;
        }
        System.out.println("结束");
    }
}
