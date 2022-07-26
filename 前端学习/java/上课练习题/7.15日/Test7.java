package cn.banyuan.hello;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入跑步的成绩：");
        int se=sc.nextInt();
        if(se<10){
           // System.out.println("进入决赛");
            System.out.println("请输入性别：");
            String sex=sc.next();

            if("男".equals(sex)){
                System.out.println("男子组");
            }else{
                System.out.println("女子组");
            }
        }else{
            System.out.println("明年再来");
        }




    }
}
