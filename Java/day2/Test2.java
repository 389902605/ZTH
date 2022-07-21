package day2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("此数为偶数！");
        } else {
            System.out.println("此数为奇数！");
        }
    }
}

