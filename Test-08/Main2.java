import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ls.add(sc.nextInt());
            System.out.println(ls.get(i));
        }
    }
}