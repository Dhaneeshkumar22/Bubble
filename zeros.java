import java.util.*;
public class zeros {

    public static void main(String args[])
    {
        int arr[]={0,1,2,3,0,7,0};
        int n=arr.length;
        int count=0;
       for(int i=0;i<n;i++)
       {
        if(arr[i]==0)
        {
            count++;
        }
        else{
            System.err.println(arr[i]);
        }
        
       }
      for(int i=0;i<count;i++)
      {
        System.err.println(0);
      }
    }
    
}
