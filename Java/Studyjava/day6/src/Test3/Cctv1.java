package Test3;

import java.beans.Customizer;

public class Cctv1 {
    public static void main(String[] args) {
        Cctv c = new Cctv();
        c.address="sss";
        c.phone="11111";
        c.id="2222";
        c.name="王二麻子";
        Cctv2 ac =new Cctv2();
        ac.cid="111";
        ac.balance=222;
        ac.c= c;
        c.show();
        ac.getInfo();

    }
}
