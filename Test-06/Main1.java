import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxi=Integer.MIN_VALUE;
        TreeMap<String,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            String s1=sc.next();
            String s2=sc.next();
            int m=Integer.parseInt(s2);
            maxi=Math.max(m,maxi);
            map.put(s1,m);
        }
        for(String key:map.keySet())
        {
            if(map.get(key)==maxi)
            {
                System.out.print(key);
                break;
            }
        }
    }
}