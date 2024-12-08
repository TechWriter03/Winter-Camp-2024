import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int first=total*2/7,second=first*2,third=first/2;
        System.out.println("Number of attendees on day 1 : "+first);
        System.out.println("Number of attendees on day 2 : "+second);
        System.out.println("Number of attendees on day 3 : "+third);
    }
}
