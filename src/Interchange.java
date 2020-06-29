public class Interchange {
    public static void main(String[] args) {
        int arr[][]={{1,5,3},{6,4,3},{7,8,9}};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
