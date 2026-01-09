import java.util.*;
public class subarray {

    public static void main(String args[])
    {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the String");
        String st=s.nextLine();

        char ch[]=st.toCharArray();

        int count=0;

        for(int  i=0;i<st.length();i++)
        {
            if(st.charAt(i)!='#')
            {
                System.out.print(ch[i]);
                count++;
             }
        }
         int l=st.length()-count;
       
         for(int i=0;i<l;i++)
           {
                    System.out.print("#");
              }
    }
    
}
