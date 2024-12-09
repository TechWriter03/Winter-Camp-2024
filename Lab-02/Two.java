import java.util.*;
public class Two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%13==0 || (n-1)%13==0)
            System.out.print("Crazy");
        else
            System.out.print("Not Crazy");
    }
}