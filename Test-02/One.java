import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a=='R' || a=='T')
            System.out.print(b*c);
        else if(a=='S')
            System.out.print((b*c)/2);
        else
            System.out.print("0");
    }
}