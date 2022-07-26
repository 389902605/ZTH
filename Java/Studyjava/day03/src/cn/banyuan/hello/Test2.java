package cn.banyuan.hello;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

      /*  if(a<b){
            int t=a; a=b;b=t;
        }
        if(a<c){
            int t=a; a=c;c=t;
        }
        if(b<c){
            int t=b; b=c;c=t;
        }

        System.out.println(a+":"+b+":"+c);*/


        int max = 0;
        int mid = 0;
        int min = 0;
        if (a > b) {  /* a 1 b 2 c 3*/
            if (a > c) {
                max = a;
                if (b > c) {
                    mid = b;
                    min = c;
                } else {
                    mid = c;
                    min = b;
                }
            }

        } else if (b > a) {
            if (b > c) {
                max = b;
                if (a > c) {
                    mid = a;
                    min = c;
                } else {
                    mid = c;
                    min = a;
                }
            }
        } else if (c > a) {   /*3>1*/
            if (c > b) {
                max = c;    /*max=3*/
                if (a > b) {
                    mid = a;
                    min = b;
                } else {
                    mid = b;
                    min = a;
                }
            }
        }

        System.out.println(max+"+"+mid+"+"+min);



        /*
        *
        * 12. （switch 语句）*完成一个简单的计算器程序。程序要求如下：
1. 读入两个整数
2. 提示用户选择对这两个整数的操作，即输出
1 ： +
2 ： -
3 ： *
4 ： /
请输入您的选择：
读入用户的选择，输出运算结果。
        *
        * */





        /*
        * 判断闰年
        *
        * */
      /*  System.out.println("请输入年份：");
        int year=sc.nextInt();
        if((year % 4==0 && year %100 !=0) ||(year %100==0 && year %400==0)){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }
*/





       /* System.out.println("请输入数字：");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();*/
       /* if(a>b){
            if (a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if (a<b){
            if (b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }

*/

      /* if(a<b){
           a=b;
       }
       if(a<c){
           a=c;
       }

        System.out.println("a:"+a);
*/


        /*读入一个整数，如果是1~5 之间，则分别输出5 个福娃的名
字，否则输出“北京欢迎你”。*/
       /* int  num=10;
        switch (num){
            case 1:
                System.out.println("111");
                    break;
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("3333");
                break;
            case 4:
                System.out.println("444");
                break;
            case 5:
                System.out.println("111");
                break;
            default:
                System.out.println("北京欢迎你");
                break;

        }*/







        /*
        * （if 语句）读入一个整数，表示一个人的年龄。如果小于6 岁，则输出“儿
童”，6 岁到13 岁，输出“少儿”；14 岁到17 岁，输出“青少年”；18 岁到35 岁，
输出“青年”；36 岁到50 岁，输出“中年”；50 岁以上输出“中老年”。
        *
        * */
       /* int age=50;
        if (age>50){
            System.out.println("中老年");
        }else if(age>=36){
            System.out.println("中年");
        }else if(age>=18){
            System.out.println("青年");
        }else if(age>=6){
            System.out.println("少儿");
        }else{
            System.out.println("儿童");
        }*/
    }
}
