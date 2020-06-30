import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]={23,4,56,23,3};
        int add=0;
        for (int i=0;i<a.length;i++)
        {
            add=add+a[i];
        }
        System.out.println("addition of values of array is "+add);
    }
}
