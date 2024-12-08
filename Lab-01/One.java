import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int weekend=(total-800)/130;
        int weekdays=weekend+10;
        System.out.println(weekdays);
        System.out.println(weekend);
    }
}
