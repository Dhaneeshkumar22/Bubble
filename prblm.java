/*import java.util.*;
class prblm
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine() ;
        char ch[]=s.toCharArray();
        int n=ch.length;
         int count=0;
         int countb=0;
         int countc=0;

        for(int i=0;i<n;i++)
        {
           
            if(s.charAt(i)=='a')
            {
                count++;
            }
              if(s.charAt(i)=='b')
            {
                countb++;
            }
              if(s.charAt(i)=='c')
            {
                countc++;
            }
         
          
        }
          System.out.print(count+"a");
           System.out.print(countb+"b");
            System.out.print(countc+"c");
    }
}*/

import java.util.*;

class prblm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        sc.close();
    }
}
