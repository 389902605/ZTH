package Dog;


/**
 * 构造方法[特殊的方法]：
 *   作用：可以更高效的赋值
 *   语法： 修饰符 类名（）{}   没有返回值  连void也没有
 *    每个类都是有构造方法  如果没写 默认会有一个无惨构造方法
 *    如果写了有参构造方法，将不会提供默认无参的构造方法。
 *    建议：有参无参一起写
 *
 *      构造方法可以有多中类，前提是 需要就写。使用过程中 在构造方法中赋值需要
 *      有对应的构造方法【参数  个数 类型 都一样】
 *
 *      前提：同一个类中方法名不能重复。如今天讲的两个Dog()构造方法就叫方法的重载。
 *      重载：在同一个类中
 *             方法名相同，参数列表不同【个数，顺序 类型】
 *             和返回值类型已及和访问修饰符无关
 *
 * this:表示当前类的
 *
 *  可以修饰属性【不写默认也有】,构造方法【必须在第一行】 ,方法
 *
 *
 */



public class Dog {
    String name;
    int health=100;
    int love;
    String stain;


    public  Dog(){
        love=100;
        this.show();
        System.out.println("我是无参构造....");
    }
    public  Dog(String name,int health){
        this(name);
        this.name= name;


        System.out.println(name+health);
        System.out.println("我是有参构造");
    }

    public  Dog(String name){
        // this();
        System.out.println("我是有参构造");
    }




    public void show(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫："+name+",健康值是："+health+
                ",和主人的亲密度是："+love+",品种是："+stain);
    }




}