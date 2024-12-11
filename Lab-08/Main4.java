import java.util.*;
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
            ls.add(sc.next());
        String key=sc.next();
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(ls.get(i).equals(key))
            {
                ind=i;
                break;
            }
        }
        if(ind!=-1)
            System.out.print(ind);
        else
            System.out.print(key+" hall is not found");
    }
}