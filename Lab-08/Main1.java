import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ls.add(sc.nextLine());
            System.out.println(ls.get(i));
        }
    }
}