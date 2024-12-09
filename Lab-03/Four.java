import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=5,c=0;
        while(n/i>=1)
        {
            c+=n/i;
            i*=5;
        }
        System.out.print(c);
    }
}
