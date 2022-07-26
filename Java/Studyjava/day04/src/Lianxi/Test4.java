package Lianxi;

public class Test4 {
    public static void main(String[] args) {
        int a[] = {7,6,9,10,1};
        System.out.println("排序之前的数组");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        for (int i=1;i<= a.length-1;i++){
            for (int j=1;j<= a.length-i;j++){
                if (a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1] = a[j];
                    a[j] =temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序之后的数是");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+"");
        }

    }
}
