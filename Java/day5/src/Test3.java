import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入直接三角形行数");
        int line= sc.nextInt();
        for (int i=1;i<=line;i++){
            for (int j=line;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
