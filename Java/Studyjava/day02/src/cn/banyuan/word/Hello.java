package cn.banyuan.word;


import cn.banyuan.hello.*;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            a=b;
        }
        if(a<c){
            a=c;


        }


        /*int year=sc.nextInt();
        if((year %4==0 && year %100 !=0)|| (year %400==0)){
            System.out.println("闰年");
        }else{
            System.out.println("不是");
        }*/



        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            int t=a;a=b;b=t;
        }
        if(a>c){
            int t=a;a=c;c=t;
        }

        if(b>c){
            int t=b;b=c;b=t;
        }
        System.out.println("a:"+a+"b:"+b+"c:"+c);*/

    }
}
