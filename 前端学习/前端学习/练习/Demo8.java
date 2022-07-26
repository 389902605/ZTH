package cn.banyuan.homework;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入总人数:");
        int total = sc.nextInt();
        int score,sum=0;
        for(int i=1;i<=total;i++){
            System.out.print("请输入第"+i+"名同学成绩:");
            score = sc.nextInt();
            if(score>80)
            {
                sum++;
            }
        }
        System.out.println("80分以上的人有:"+sum);
        double rate = (double)sum/total*100;
        System.out.println("80分以上的比例是:"+rate+"%");

    }
}
