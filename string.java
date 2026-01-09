public class string {
    public static void main(String args[])
    {
     /*   String word="Dhaneesh 9384228879";
        int count=0;
       for(int i=0;i<word.length();i++)
        {
           if(word.charAt(i)>='0')
           {
            if(word.charAt(i)<='9')
            {
              // System.out.print(word.charAt(i));
              count++;
                   
            }


              
           }
        }
        System.out.println(count);
         System.out.println(word.replaceAll("[a-eA-E]"," "));   */



        String s="Dhaneeshkumar m";

        char ch[]=s.toCharArray();

        for(char x:ch)
        {
          System.out.println(x);
        }

        System.out.println(s.length());
        System.out.println(ch.length);

        if(s.charAt(5)=='e')
        {
          System.out.println("yes");  
        }


        }
    }
    

