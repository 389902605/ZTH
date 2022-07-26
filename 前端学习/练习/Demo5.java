package cn.banyuan.homework;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;int upSum = 0,downSum = 0;
        for(int i=1;i<=10;i++){
            System.out.print("请输入第"+i+"位顾客的年龄");
            age = sc.nextInt();
            if(age>30){
                upSum++;
            }else{
                downSum++;
            }
        }
        double rateUp = upSum*10;
        double rateDown = downSum*10;
        System.out.println("大于30岁的比例是"+rateUp+"%");
        System.out.println("小于30岁的比例是"+rateDown+"%");

    }
}
