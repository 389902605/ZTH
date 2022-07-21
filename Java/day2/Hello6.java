package day2;

import java.util.Scanner;

public class Hello6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名次");
        int mc = sc.nextInt();
        switch (mc){
            case 1:
                System.out.println("奖励夏利营");
                break;
            case 2:
                System.out.println("奖励笔记本");
                break;
            case 3:
                System.out.println("奖励硬盘");
                break;
            default:
                System.out.println("谢谢参与");
                break;

        }
    }
}
