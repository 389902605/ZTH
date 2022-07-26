package cn.banyuan.hello;

public class HelloFinal {

    /**
     * +  如果遇到 字符串的时候的作用是拼接的作用
     *     如果就是两个数值类型在一起就是加法运算
     * @param args
     */
    public static void main(String[] args) {
        final  double   PI=3.14;
        //pi=4.14;
        double r=2;
        double  area =PI * r * r;
        System.out.println("圆的面积是："+area);

    }




}
