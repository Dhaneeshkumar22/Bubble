import java.util.*;

class practice {
    
    static int countSubarrays(int[] arr, int l, int r) {
        
        int n = arr.length;
        int count = 0;

        // Iterate over all possible starting
        // points of subarrays
        for (int i = 0; i < n; i++) {
            
            int maxVal = arr[i];

            // Iterate over all possible ending
            // points of subarrays
            for (int j = i; j < n; j++) {
                
                // Update maximum element in the 
                // current subarray
                maxVal = Math.max(maxVal, arr[j]);

                // Check if maxVal is within the
                // given range
                if (maxVal >= l && maxVal <= r) {
                    count++;
                }
            }
        }

        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the range l and r");
        int l=s.nextInt();
        int r=s.nextInt();
        System.out.println(countSubarrays(arr, l, r));
    }
}

   