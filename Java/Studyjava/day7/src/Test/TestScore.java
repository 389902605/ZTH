package Test;

import java.util.Scanner;

public class TestScore {
        Scanner sc = new Scanner(System.in);
        public void cctv () {
            double sun;
            double age;
            System.out.println("请输入Java成绩：");
            double JavaF = sc.nextDouble();
            System.out.println("请输入c#成绩：");
            double JavaE = sc.nextDouble();
            System.out.println("请输入DB成绩：");
            double Javaw = sc.nextDouble();
            sun = JavaE + JavaF + Javaw;
            age = sun / 3;
            System.out.println("总成绩是：" + sun);
            System.out.println("平均成绩是" + age);
        }

    public static void main(String[] args) {
            TestScore one = new TestScore();
            one.cctv();

    }



        }
