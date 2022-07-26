package cn.banyuan.homework;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        int[] daysss={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("输入年份");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("输入日期");
        int day =sc.nextInt();
        int sum=0;
        switch (month-1){
            case 11:day += 30;
            case 10:day += 31;
            case 9:day += 30;
            case 8:day += 31;
            case 7:day += 31;
            case 6:day += 30;
            case 5:day += 31;
            case 4:day += 30;
            case 3:day += 31;
            case 2:day += 28;
            case 1:day += 31;
        }
        if ((month !=1 && month!=2) && (year%4==0&&year%100!=0)||(year%400==0)){
            day+=1;
        }
        System.out.println(day);

    }
}
