package day2;

import java.util.Scanner;

public class Hello7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择您要拨打的电话");
        System.out.println("拨打爸爸：1");
        System.out.println("拨打妈妈：2");
        System.out.println("拨打爷爷：3");
        System.out.println("拨打奶奶：4");
                int score= sc.nextInt();
                if (score==1){
                    System.out.println("拨打爸爸电话");

                }else  if (score==2){
                    System.out.println("拨打妈妈电话");
                }else if (score==3){
                    System.out.println("拨打爷爷电话");
                }else if(score==4){
                    System.out.println("拨打奶奶电话");
                }
                System.out.println("程序结束");
        }
    }

