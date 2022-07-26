package cn.banyuan;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*检查作业  合格的体育课  不合格的上午上机 下午理论*/
        System.out.println("老师我合格了（Y/N）");
        Scanner sc=new Scanner(System.in);
        String answer=sc.next();
        while("N".equals(answer)){
            System.out.println("上午上机下午看书");
            System.out.println("老师我合格了（Y/N）");
            answer=sc.next();
        }
        System.out.println("上体育课...");


    }
}
