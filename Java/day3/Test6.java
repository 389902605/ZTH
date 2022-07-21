package day3;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        int sum = 0;
        int cj=0;
        for (int i =1;i<=5;i++){
            System.out.println("请输入第"+i+"门课的成绩");
            cj= sc.nextInt();
            if (cj<0){
                System.out.println("抱歉，分数录入错误，请重新录入");
                break;
            }else {
                sum=sum+cj;
            }
            int pjs=sum/5;
            System.out.println(name+"的平均分是："+pjs);
        }
    }
}
