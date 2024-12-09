import java.util.*;
public class Three
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            char start='W';
            int n=sc.nextInt();
            for(int j=1;j<=n;j++)
            {
                char ch=start;
                for(int k=1;k<=n;k++)
                {
                    System.out.print(ch);
                    ch=(ch=='W')?'B':'W';
                }
                start=(start=='W')?'B':'W';
                System.out.println();
            }
        }
    }
}