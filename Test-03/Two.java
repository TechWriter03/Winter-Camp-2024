import java.util.*;
public class Two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            if(n%2==1)
                c++;
        }
        System.out.print(c);
    }
}