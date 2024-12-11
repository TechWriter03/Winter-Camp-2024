import java.util.*;
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(sc.next(),sc.nextInt());
        System.out.println(map.toString());
        map.put(sc.next(),sc.nextInt());
        System.out.print(map.toString());
    }
}