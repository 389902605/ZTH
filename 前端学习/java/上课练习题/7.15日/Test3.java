package cn.banyuan.hello;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age=   sc.nextInt();
        System.out.println("请输入你的姓名：");
        String name =sc.next();
        System.out.println("请输入你的分数：");
        double score  =sc.nextDouble();
        System.out.println("年龄是："+age+",name:"+name+",score:"+score);

    }
}
