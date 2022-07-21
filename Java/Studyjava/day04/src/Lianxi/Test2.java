package Lianxi;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //3.根据输入的行数，打印一个等腰三角形【10】
        System.out.print("请输入直角三角形的行数：");
        int l = sc.nextInt();
        for (int i = 0;i<l;i++){
            System.out.println("*");
            for (int j = l;j>i;j--){
                System.out.print(" ");
            }
            for (int k =0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
