package cn.banyuan.hello;

import java.util.Scanner;

public class Test$7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入跑步成绩");
        int se= sc.nextInt();
        if (se<10){
            System.out.println("进入决赛圈");
            System.out.println("请输入性别：");
            String sex= sc.next();
            if ("男".equals(sex)){
                System.out.println("男子组");
            }else{
                System.out.println("女子组");
            }
        }else{
            System.out.println("明年再来");
        }
    }
}
