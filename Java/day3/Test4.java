package day3;

public class Test4 {

    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            //判单不能被3整除的数并取出相加
            if (i%3!=0){
                sum+=i;
            }
        }
        System.out.println("1到100之间不能被3整除的数和和为"+sum);
    }

    public static class hello {
        public static void main(String[] args) {
            final double MY_PI=3.14;
            double r = 2;
            double area=MY_PI*r*r;
            System.out.println("圆的面积是："+area);
        }
    }
}
