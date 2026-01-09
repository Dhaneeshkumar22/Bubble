class main{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,5,6,7,8,9,6,4,0};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            for(int j=i;j<n;j++)
            {
                if(temp<arr[j])
                {
                    temp=arr[j];
                   
                }
             
                 arr[i-1]=temp;
                 if(arr[i]==arr[j])
                 {
                    arr[i]=-1;
                 }
               
            }
        }
        for(int x:arr)
        {
        System.out.print(" "+x);
        }
    }
}