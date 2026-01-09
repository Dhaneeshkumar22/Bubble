import java.util.*;

public class Array {
    public static void main(String[] args) {

       
        int array[]=new int[]{10,1,35,2,2,4,5,2,41,2,4,65,};
        System.out.println(Arrays.toString(array)); 
        //Add elements to array
        System.out.println("Add one element to array at index 2:");

         int arr[]=new int[array.length+1];
            for(int i=0;i<array.length;i++){
                arr[i]=array[i];
            }
            arr[2]=25;

            System.out.println(Arrays.toString(arr));

            //Array Deletion

           /* System.out.println("Delete one element from array at index 3:");
            int del=2;
            for(int i=0,j=0;i<arr.length;i++)
            {
                if(i==del)
                {
                    continue;
                  
                }
                  arr[j++]=array[i];
            }
            System.out.println(Arrays.toString(arr));
        
*/

           //search element in array
              System.out.println("Search element 41 in array:");    
                int search=41;
               
                System.out.println("Element found at index: " + Arrays.binarySearch(array, search));


    }
}


