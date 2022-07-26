package Dog;

import java.util.Scanner;

public class Person {
    /*
     * static:  静态的  可以修饰  属性  方法  代码块
     *          是随着类的加载而加载的
     * 使用场景:   饮水机  【公共的共享的时候适合用statis修饰】
     *            水杯    各自使用 不时候使用static修饰
     *
     *    修饰属性  static  属性名   【静态变量】
     *    修饰方法  static 的方法 称之为静态方法
     *    静态方法   静态方法不可以调用普通方法,
     *               在静态方法中是不可以使用this关键字的
     *    普通方法  普通方法可以调用静态方法
     *
     *   静态的属性或者是方法 都可以以类名.属性名【方法名】 调用
     *   当然也可以使用new对象的方法调用
     *
     *
     *
     * */
    String name;
    int age;
    static String coution;


    static {
        Scanner sc = new Scanner(System.in);
    }



    public void m1(){
        System.out.println(age);
        System.out.println(this.age);
        n2();
        System.out.println("m1...");
    }
    public void m2(){
        System.out.println("m2");
    }
    public static void n1(){
        // System.out.println(age);
        //System.out.println(this.age);
        //m2();
        System.out.println("satic  n1...");
    }

    public static void n2(){
        System.out.println("satic  n2...");
    }
    public Person(){}
    public  Person(String name,int age,String coution){
        this.name=name;
        this.age=age;
        this.coution=coution;

    }
    public  void show(){
        System.out.println("姓名是："+name+",年龄是："+age+",国籍是："+coution);
    }


    public static void main(String[] args) {
        Person p=new Person();
        p.m1();
        p.n1();
        Person.coution="";
    }


}



