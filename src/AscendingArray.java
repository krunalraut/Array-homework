import java.lang.reflect.Array;
import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int arr[]={6,4,9,2,8,3,5};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
