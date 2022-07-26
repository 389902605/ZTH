package cn.banyuan;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int  num=sc.nextInt();
        for(int i=0,j=num;i<=num;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }

    }
}
