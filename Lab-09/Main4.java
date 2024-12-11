import java.util.*;
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer>set1=new HashSet<>();
        for(int i=0;i<n;i++)
            set1.add(sc.nextInt());
        Set<Integer>set2=new HashSet<>();
        for(int i=0;i<n;i++)
            set2.add(sc.nextInt());
        if(set1.equals(set2))
            System.out.print("Both sets are same");
        else
            System.out.print("Both sets are different");
    }
}