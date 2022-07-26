package cn.banyuan.hello;

public class HelloFinal2 {
    public static void main(String[] args) {
        final  double PI=3.14;//fianl 最终的浮点型数字为3.14 常量
        double r=2;
        double area=PI*r*r*r; //3.14×2×2×2 命名area
        System.out.println("圆的面积是："+area);//求元的面积加上命名area
    }
}
