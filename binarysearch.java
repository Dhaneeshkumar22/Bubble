import java.util.*;

class binarysearch
{

    static int element(int arr[],int k)
    {

        int l=0;
        int r=arr.length-1;
       
        while(l<=r)
        {
             int mid=l+(r-l)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            if(arr[mid]<k)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
          
        }
        return -1;

    }
    public static void main(String args[])
{

    int arr[]={10,45,20,85,30,40,50,60,70,80,90,100};

    Arrays.sort(arr);

    int k=85;

    System.out.println("Sorted array:"+Arrays.toString(arr));

    System.out.print("Element found at index:"+element(arr,k));

}
}