import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int q=n/4,r=n%4;
            if((q+r)%2==0)
                System.out.print("No");
            else
                System.out.print("Yes");
            System.out.println();
        }
    }
}