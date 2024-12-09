import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean c=sc.nextBoolean();
        if((a && b) && !c)
            System.out.print("True");
        else
            System.out.print("False");
    }
}