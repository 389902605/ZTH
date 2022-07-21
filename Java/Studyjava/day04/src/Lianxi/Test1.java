package Lianxi;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //1.计算3个班，每个班4名学生的平均分以及3个班中的最高分是多少(平均分5，最高分10)
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            sum = 0;
            System.out.println("第" + i + "个班的成绩：");
            for (int j = 1; j <= 4; j++) {
                System.out.print("请输入第" + j + "个学生的成绩：");
                int score =sc.nextInt();
                if (max < score) {
                    max = score;
                }
                sum += score;
            }
            System.out.println("第" + i + "个班的平均分是：" + (sum / 4));
        }
        System.out.println("最高分为：" + max);

    }
}