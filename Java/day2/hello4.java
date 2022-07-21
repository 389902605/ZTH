package day2;

import java.util.Scanner;

public class hello4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scoreJava = sc.nextInt();
        int scoreMusic = sc.nextInt();
        if (scoreJava > 98) {
            System.out.println("奖励一个mp4");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        if ((scoreJava > 98 && scoreMusic > 80) || (scoreJava == 100 && scoreMusic > 70)) {
            System.out.println("奖励一个mp4");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        if (scoreJava > 98) {
            System.out.println("奖励一个mp4");
        } else {
            System.out.println("编码");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        double money = sc.nextDouble();
        if (money > 500) {
            System.out.println("玩");
        } else if (money <= 500) {
            System.out.println("next");
        }
    }
}
