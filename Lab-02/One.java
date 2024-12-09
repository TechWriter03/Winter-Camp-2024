import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean c=sc.nextBoolean();
        if(c && a==b && a==6)
            System.out.print(a+1);
        else if(c && a==b)
            System.out.print(a+b+1);
        else
            System.out.print(a+b);
    }
}