package cn.banyuan.homework;

import java.util.Scanner;

public class Demo9 {
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
        switch (month){
            case 1:sum=day;break;
            case 2:sum=31+day;break;
            case 3:sum=31+28+day;break;
            case 4:sum=31+28+31+day;break;
            case 5:sum=31+28+31+30+day;break;
            case 6:sum=31+28+31+30+31+day;break;
            case 7:sum=31+28+31+30+31+30+day;break;
            case 8:sum=31+28+31+30+31+30+31+day;break;
            case 9:sum=31+28+31+30+31+30+31+31+day;break;
            case 10:sum=31+28+31+30+31+30+31+31+30+day;break;
            case 11:sum=31+28+31+30+31+30+31+31+30+31+day;break;
            case 12:sum=31+28+31+30+31+30+31+31+30+31+30+day;break;
            default:
                System.out.println("输入有误");break;
        }
        if(year%4==0&&year%100!=0||year%400==0){
            if(month>2)
                sum++;
        }
        System.out.println(sum);
    }
}
