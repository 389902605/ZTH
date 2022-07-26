package Dog;

public class Seller {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sell(Excelle ell){
        System.out.println(this.name+"正在买的车型："+ell.getType()+"\t编号："+ell.getId());
    }
    public void sell(Regal rell){
        System.out.println(this.name+"正在卖的车型："+rell.getType());
    }
    public void sell(Excelle ell,int num){
        System.out.println(this.name+"正在买的车型："+ell.getType()+"\t数量是："+num);
    }

}
