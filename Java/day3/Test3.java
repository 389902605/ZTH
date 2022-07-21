package day3;

public class Test3 {
    public static void main(String[] args) {
        int sum = 2012;
        double i = 25;
        while (i <100) {
            System.out.println(sum+"年的人数是："+i+"万人");
            sum++;
            i=i+i*0.25;
        }
        System.out.println(sum+"年的人数是："+i+"万人"+(sum-2012));

    }

}