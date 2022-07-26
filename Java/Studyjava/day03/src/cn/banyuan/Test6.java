package cn.banyuan;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*上机做题  合格的上体育课 不合格的继续上机和看书*/
        Scanner sc=new Scanner(System.in);
        String answer="";
        do{
            System.out.println("上机做题");
            System.out.println("老师我合格了（Y/N）");
            answer=sc.next();

        }while("N".equals(answer));
        System.out.println("体育课");

    }
}
