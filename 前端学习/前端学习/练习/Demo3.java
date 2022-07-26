package cn.banyuan.homework;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("MyShopping购物系统 >购物结算");
        System.out.println();
        System.out.println("*****************************");
        System.out.println("请选择要购买的商品编号");
        System.out.println("1.T恤      2.网球鞋    3.网球拍");
        System.out.println("*****************************");
        Scanner sc = new Scanner(System.in);
        int num;
        String choice;
        do{
            System.out.print("请选择商品编号:");
            num=sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("T恤          ￥190");break;
                case 2:
                    System.out.println("网球鞋        ￥200");break;
                case 3:
                    System.out.println("网球拍        ￥150");break;
            }
            System.out.println("是否继续?");
            choice=sc.next();
        }while("Y".equals(choice));
        System.out.println("结束");
    }
}
