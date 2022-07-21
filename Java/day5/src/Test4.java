import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

    }
}
