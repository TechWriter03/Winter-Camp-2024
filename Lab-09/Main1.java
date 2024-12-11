import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            map.put(m,map.getOrDefault(m,0)+1);
        }
        int sum=0;
        for(int key:map.keySet())
            if(map.get(key)==1)
                sum+=key;
        System.out.print(sum);
    }
}