package day3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        for(int i=0,j=num1;i<=num1;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}
