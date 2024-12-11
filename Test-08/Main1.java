import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
            ls.add(sc.nextInt());
        int key=sc.nextInt(),c=0;
        for(int it:ls)
            if(it==key)
                c++;
        System.out.print(c);
    }
}