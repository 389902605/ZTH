package cn.banyuan.hello;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num= sc.nextInt();
        if (num % 2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
