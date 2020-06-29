public class ArrayEquality {
    public static void main(String[] args) {
        int arr1[]={2,3,7,5,9,6};
        int arr2[]={2,3,7,5,9,6};
        boolean equal=false;
        if (arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                if (arr1[i]==arr2[i])
                {
                    equal=true;
                }
                else
                {
                    equal=false;
                }
            }
        }
        else {
            equal=false;
        }
        if (equal==true)
        {
            System.out.println("arrays are equal");
        }
        else
        {
            System.out.println("arrays are not equal");
        }
    }
}
