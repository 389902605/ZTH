package day2;

import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        int data = 100;
        int result;
        result = (data*10+5)/2+(int)3.14159;
        System.out.println(result);
        Scanner sc=new  Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age=sc.nextInt();
        System.out.println("请输入你的姓名:");
        String name=sc.next();
        System.out.println("请输入你的分数:");
        double score=sc.nextDouble();
        System.out.println("年龄:"+age+",name"+name+"score:"+score);
        System.out.println("______________________________________");
        System.out.println("请输入品牌");
        String naw=sc.next();
        System.out.println("请输入重量");
        double new1=sc.nextDouble();
        System.out.println("输入电池类型");
        String new2=sc.next();
        System.out.println("请输入价格");
        int new3=sc.nextInt();
        System.out.println("品牌:"+name+"重量:"+new1+"电池类型："+new2+"价格："+new3);
        System.out.println("__________________________________________________");





    }
}
