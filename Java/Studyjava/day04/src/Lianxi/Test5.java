package Lianxi;

import java.util.Scanner;

public class Test5 {
    static String[] names=new String[6];
    static String[] stater=new String[6];
    static int[] dates=new int[6];
    static int[] count=new int[6];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 0;
        while (s != 6) {
            System.out.println("欢迎使用迷你DVD管理器");
            System.out.println("__________________");
            System.out.println("1，新增DVD");
            System.out.println("2，查看DVD");
            System.out.println("3，删除DVD");
            System.out.println("4，借出DVD");
            System.out.println("5，归还DVD");
            System.out.println("6，退出DVD");
            System.out.println("_________________");
            System.out.println("请输入您的选择：");
            s = sc.nextInt();
            if (s == 1) {
                System.out.println("请输入添加的DVD名称");
                addDvd();
            } else if (s == 2) {
                System.out.println("已经入查看功能");
                seeDvd();
            } else if (s == 3) {
                System.out.println("已经入删除功能");
                de1DVd();
            } else if (s == 4) {
                System.out.println("已进入借出功能");
                borDvd();
            } else if (s == 5) {
                System.out.println("已经入归还功能");
                retDvd();
            }
        }
    }
    public static void addDvd(){
        Scanner sc=new Scanner(System.in);
        int c=1;
        while (names[c-1]!=null)
        {
            c+=1;
        }
        if (c==6)
        {
            System.out.println("用户仓库已满");
        }else {
            names[c-1]=sc.next();
            stater[c-1]="可借";
            dates[c-1]=0;
            count[c-1]=0;
            if (names[c-1]!=null){
                System.out.println(names[c-1]+"添加成功");
            }
        }
    }
    public static void seeDvd(){
        System.out.println("-->查看DVD");
        System.out.println("序号\t状态\t名称\t借出日期\t借出次数");
        for (int i=0;i<names.length;i++){
            if (names[i]==null){
                break;
            }else {
                System.out.println(i+1+"\t"+stater[i]+"\t"+names[i]+"\t");
                if (dates[i]==0){
                    System.out.println(" "+"\t\t"+count[i]+"次");
                }else{
                    System.out.println(dates[i]+"\t\t"+count[i]+"次");
                }
            }
        }
    }
    public static void de1DVd(){
        System.out.println("-->删除DVD");
        System.out.println("请输入您要删除DVD的序号：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("删除"+names[n-1]+"成功");
        if (n!=names.length){
            for (int i=n-1; i<names.length-1; i++)
            {
                names[i]=names[i+1];
            }
            for (int i=n-1; i<stater.length-1; i++)
            {
                stater[i]=stater[i+1];
            }
            for (int i=n-1; i<dates.length-1; i++)
            {
                dates[i]=dates[i+1];
            }
            for (int i=n-1; i<count.length-1; i++) {
                count[i] = count[i + 1];
            }

            }else{
        names[names.length-1]=null;
        stater[names.length-1]=null;
        dates[names.length-1]=0;
        count[names.length-1]=0;
    }
}
        public static void borDvd(){
            Scanner sc=new Scanner(System.in);
            System.out.println("-->借出DVD");
            System.out.print("请输入想要借出DVD的序号");
            int s=sc.nextInt();
            System.out.print("请输入借出的日期：");
            int d=sc.nextInt();
            if (stater[s-1]=="可借")
            {
                stater[s-1]="已借出";
                dates[s-1]=d;
            }else{
                System.out.println("该DVD已借出。");
            }
        }
    public static void retDvd(){
        //归还DVD
        Scanner sc=new Scanner(System.in);
        System.out.println("-->归还DVD");
        System.out.print("请输入DVD名称：");
        String name=sc.next();
        int n=0;
        for (int i=0; i<names.length; i++)
        {
            if (names[i]==name)
            {
                n=i;
                break;
            }
        }
        System.out.print("请输入归还日：");
        int gd=sc.nextInt();
        System.out.println("归还"+name+"成功!");
        System.out.println("借出日期为："+dates[n]+"日");
        System.out.println("归还日期为："+gd+"日");
        System.out.println("应付租金（元）："+(gd-dates[n]));
        stater[n]="可借";
        dates[n]=0;
        count[n]+=1;
    }

}



