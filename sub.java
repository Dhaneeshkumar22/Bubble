import java.util.*;

public class sub {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

      ArrayList<Integer> list=new ArrayList<>();
      System.out.println("Enter the size of array");
      int n=s.nextInt();
      System.out.println("Enter the elements of array");
      for(int i=0;i<n;i++)
      {
          list.add(s.nextInt());    
      }

      int sum=0;
      int max=0;
      for(int i=0;i<list.size();i++)
      {

          sum=sum+list.get(i);
          if(sum<0)
          {
              sum=0;
          }
          if(max<sum)
          {
              max=sum;
          }
          
      }
      System.out.println("The maximum subarray sum is :"+max);
      s.close();
     

     
 }
    
}
