package day2;

import java.util.Scanner;

public class hello3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = a > b ?"ok":"no ok";
        System.out.println(str);
    }
}
