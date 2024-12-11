import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>ls=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            ls.add(sc.nextInt());
            map.put(ls.get(i),map.getOrDefault(ls.get(i),0)+1);
        }
        int c=0;
        for(int it:ls)
            if(map.getOrDefault(it+1,0)>0)
                c++;
        System.out.print(c);
    }
}