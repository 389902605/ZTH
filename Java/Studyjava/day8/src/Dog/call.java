package Dog;

import java.util.Scanner;

public class call {
    public static void main(String[] args) {
        Excelle ell=new Excelle("宝马740","206");
        Regal reg=new Regal("宝马X1","A60");
        Seller seller=new Seller();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入销售员的姓名：");
        seller.setName(sc.next());
        seller.sell(ell);
        seller.sell(ell,20);

    }
}
