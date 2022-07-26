package cn.banyuan.homework;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.print("输入学生的姓名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int score;int sum = 0;
        for(int i=1;i<=5;i++){
            System.out.print("请输入5门课中的第"+i+"门课成绩：");
            score = sc.nextInt();
            sum+=score;
        }
        double avg = (double)sum/5;
        System.out.println(name+"的平均分为："+avg);
    }
}
