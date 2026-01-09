import java.util.*;
public class Duplicates {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,5};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
    }
    System.out.println("Array elements after removing duplicates: ");
    for(Integer i:set)
    {
        System.out.print(i + " ");
}
    }
}
