package Lianxi;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ziFu[] = new String[9];
        ziFu[0] = "a";
        ziFu[1] = "b";
        ziFu[2] = "c";
        ziFu[3] = "e";
        ziFu[4] = "f";
        ziFu[5] = "p";
        ziFu[6] = "u";
        ziFu[7] = "z";
        System.out.println("原字符序列为：");
        for (int i = 0; i < ziFu.length; i++) {
            System.out.print(ziFu[i] + " ");
        }
        System.out.println();
        int index = ziFu.length - 1;
        System.out.print("请输入您要输入的字符:");
        String str = sc.next();
        for (int i = 0; i < ziFu.length; i++) {
            if (str.compareTo(ziFu[i]) < 0) {
                index = i;
                break;
            }
        }
        for (int i = ziFu.length - 1; i > index; i--) {
            ziFu[i] = ziFu[i - 1];
        }
        ziFu[index] = str;
        System.out.print("插入字符的下标为:" + index);
        System.out.println();
        System.out.print("插入后的字符序列为：");
        for (int i = 0; i < ziFu.length; i++) {
            System.out.print(ziFu[i] + " ");
        }

    }
}