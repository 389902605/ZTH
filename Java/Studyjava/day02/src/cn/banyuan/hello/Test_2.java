package cn.banyuan.hello;

import com.sun.security.jgss.GSSUtil;

public class Test_2 {
    public static void main(String[] args) {
        double a=10.9;//a是10.9
        System.out.println("a:"+a);
        int b=(int)a;//double 强制转换int 浮点数转换成整数省略小数点后的数
        System.out.println("b:"+b);
    }
}
