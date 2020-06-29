public class DuplicateValue {
    public static void main(String[] args) {
        int arr[]={2,34,5,6,2,5,4,6};
        int add=0;
        for (int a=0;a<arr.length;a++)
        {
            for (int b=a+1;b<arr.length;b++){
                if(arr[a]==arr[b])
                {
                    add=add+1;
                }
            }
        }
        System.out.println("total duplicate values are "+add);
    }
}
