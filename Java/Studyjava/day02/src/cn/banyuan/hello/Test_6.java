package cn.banyuan.hello;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        int a = 5;//a赋值5
        int b = (a++) + (--a) + (++a);//a++这里还是5++是后算 --a 就是6-1=5 ++a 1+5=6最后等于16
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        double score= sc.nextDouble();
        if (score>90){
            System.out.println("A");
        }else if (score>80){
            System.out.println("B");
        }else if (score>60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
        //分数大于90是A 大于80是b 大于60是c 其余都是d
        System.out.println("结束");
    }
}
