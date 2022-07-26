package Dog;

import java.util.Scanner;

public class TestPet {
    public static void main(String[] args) {


        System.out.println("欢迎来到宠物店");
        System.out.println("请输入需要领养的宠物的名称");
        Scanner sc=new Scanner(System.in);
        String sname=sc.next();
        System.out.println("输入需要领养的宠物类型：");
        System.out.println("1.狗狗 2企鹅");

        Dog dog = new Dog();
        dog.name=sname;

        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.print("请选择狗狗的品种（1.拉布拉多 2雪纳瑞）");

                int p=sc.nextInt();
                if(1==p){
                    dog.stain="拉布拉多";
                    dog.show();
                }else if(2==p){
                    dog.stain="雪纳瑞";
                    dog.show();
                }


                break;

            case 2:
                break;

            default:
                break;
        }


    }
}

