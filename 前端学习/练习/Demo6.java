package cn.banyuan.homework;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        System.out.print("请输入学生姓名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int score,sum =0;
        for(int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"门课的成绩:");
            score =sc.nextInt();
            while(score<0||score>100){
                System.out.println("输入有误,请重新输入");
                score = sc.nextInt();
            }
            sum+=score;

        }
        System.out.println("总分是"+sum);
    }
}
