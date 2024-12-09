import java.util.*;
public class Three
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>8)
            System.out.print("Yes");
        else if(a<2)
            System.out.print("No");
        else if(b>8)
            System.out.print("Yes");
        else if(b<2)
            System.out.print("No");
        else
            System.out.print("Maybe");
    }
}