package cn.banyuan.hello;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        double score=sc.nextDouble();

        if(score>90){
            System.out.println("A");
        }else if(score>80){
            System.out.println("B");
        }else if(score>60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }


        System.out.println("程序结束");


    }
}
