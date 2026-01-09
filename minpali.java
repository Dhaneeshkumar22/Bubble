public class minpali {
    public static void main(String args[])
    {
        String s="alay";
        StringBuilder st=new StringBuilder(s);
        st.reverse();
        if(s.equals(st.toString()))
        {
            System.out.println("palindrome");
            System.out.println("length 0");
           
        }
        else
        {
            for(int i=1;i<s.length();i++)
            {
              StringBuilder sb=new StringBuilder();`
              sb.append(s.substring(0,i));
              String newS=s+sb.toString();
              if(newS.equals(new StringBuilder(newS).reverse().toString()))
              {
                
                  System.out.println("not palindrome");
                  System.out.println("minimum characters to be added:"+i);
                  break;
              }
              sb.reverse();
              
              System.out.println(newS);
              if(newS.equals(new StringBuilder(newS).reverse().toString()))
              {
                
                  System.out.println("not palindrome");
                  System.out.println("minimum characters to be added:"+i);
                  break;
              }
        }
    }

    }
    
}
