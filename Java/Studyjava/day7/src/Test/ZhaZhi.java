package Test;

public class ZhaZhi {
    public String zha(String fruit, int num) {
        String fru = fruit + "汁" + num + "杯";
        return fru;
    }

    public static void main(String[] args) {
        ZhaZhi z = new ZhaZhi();
        String zhi = z.zha("桃子", 2);
        System.out.println(zhi);
    }
}