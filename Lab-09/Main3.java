import java.util.*;
public class Main3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String>set=new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(sc.next());
        System.out.print(set.size());
    }
}