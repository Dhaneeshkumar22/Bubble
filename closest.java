
class closest
{
   static int closestnum(int n,int m) {
        int mindif=Integer.MAX_VALUE;
        int closest=0;

        for(int i=n-Math.abs(m);i<=n+Math.abs(m);i++)
        {
            if(i%m==0)
            {
                int dif=Math.abs(n-i);
                if(dif<mindif||(dif==mindif&&i<closest))
                {
                    mindif=dif;
                    closest=i;
                }
            }
        }
        return closest;

        
    }
    public static void main(String args[])
    {
        int n=-15;
        int m=6;
        System.out.println(closestnum(n,m));
    }
}