class Bubble {
    static void BubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {   // Only n-1 passes needed
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {   // Compare adjacent elements
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        BubbleSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
