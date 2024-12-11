import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.print(x/y);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}