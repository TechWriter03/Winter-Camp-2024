import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("1");
        }
        else
        {
            int pow=1;
            while(pow<n)
                pow*=2;
            System.out.print(pow/2);
        }
    }
}