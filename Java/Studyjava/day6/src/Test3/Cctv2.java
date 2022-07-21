package Test3;

public class Cctv2 {
    String cid;
    int balance;
    Cctv c;

    public String getInfo(){
        return "卡号："+cid+",余额:"+balance+",所属用户"+c.name;
    }

    public void withdraw(){
        System.out.println("取钱成功");
    }

    public void save(){
        System.out.println("存钱成功");
    }
}

