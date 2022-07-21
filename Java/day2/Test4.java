package day2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("输入学生的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int score;int sum =0;
        for (int i=1;i<=5;i++){
            System.out.println("请输入5门功课中的第"+i+"门课成绩");
            score = sc.nextInt();
            sum+=score;
        }
        double agv = (double)sum/5;
        System.out.println(name+"的平均分为："+agv);
    }
}
