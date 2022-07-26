package cn.banyuan.hello;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//需要客户输入时使用这个语法。
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();//整数类型int 后面就是sc nextInt（）
        System.out.println("请输入你的姓名：");
        String name = sc.next();//引用类型就用 next（）
        System.out.println("请输入你的分数：");
        double score = sc.nextDouble();//浮点型就是 nextDouble
        System.out.println("年龄是："+age+",name:"+name+",score"+score);


    }
}
