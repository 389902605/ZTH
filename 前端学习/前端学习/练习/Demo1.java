package cn.banyuan.homework;

public class Demo1 {
    public static void main(String[] args) {
        int people =250000;
        int year =0;
        while(people<1000000){
            people= (int) (people*1.25);
            year++;
        }
        System.out.println(year);
    }
}
