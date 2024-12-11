import java.util.*;
public class Main3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
            ls.add(sc.next());
        String key=sc.next();
        int c=0;
        for(int i=0;i<n;i++)
            if(ls.get(i).equals(key))
                c++;
        System.out.print(c);
    }
}