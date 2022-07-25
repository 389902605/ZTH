package Test;

public class TestMax {
    public int Max(int arr[]){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        TestMax t = new TestMax();
        int a[] = {1,22,45,67,90};
        int b = t.Max(a);
        System.out.println("最大值是："+b);
    }
}
