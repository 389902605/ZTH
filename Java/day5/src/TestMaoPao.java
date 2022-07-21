public class TestMaoPao {
    public static void main(String[] args) {
        int a[]= {77,66,9,100,1};
        System.out.print("排序之前的数组");
        for (int i=1;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        //第一层循环是冒泡的总次数---为（n-1）
        //第二层循环是单次循环的次数---为（n-i）
        //if判断 然后交换前后数
        for (int i=1;i<=a.length;i++){
            for (int j=1;j<=a.length-i;j++){
                if (a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("排序之后的数组");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+"");
        }
        }
    }
