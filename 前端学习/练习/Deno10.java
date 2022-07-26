package cn.banyuan.homework;

import java.util.Scanner;

public class Deno10 {
    public static void main(String[] args) {
        int[] arr1={31,28,31,30,31,30,31,31,30,31,30,31};//非闰年
        int[] arr2={31,29,31,30,31,30,31,31,30,31,30,31};//闰年
        int []day=new int[3];
        System.out.println("输入年份");
        Scanner sc = new Scanner(System.in);
        day[0] = sc.nextInt();
        System.out.println("输入月份");
        day[1] = sc.nextInt();
        System.out.println("输入日期");
        day[2] = sc.nextInt();
        int judge=0;
        if ((day[0]%4==0&&day[0]%100!=0)||(day[0]%400==0)){
            judge=1;
        }else {
            judge=0;
        }
        int sum=0;
        switch (judge){
            case 1:
                for(int i=1;i<day[1];i++){
                    sum+=arr2[i];
                }
                sum+=day[2];
                break;
            case 0:
                for(int i=1;i<day[1];i++){
                    sum+=arr1[i];
                }
                sum+=day[2];
                break;
        }
        System.out.println(sum);

    }
}