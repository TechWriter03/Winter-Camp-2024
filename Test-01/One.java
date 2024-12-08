import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.next();
        int c=sc.nextInt();
        char d=sc.next().charAt(0);
        float e=sc.nextFloat();
        System.out.println("Event Name : "+a);
        System.out.println("Event Type : "+b);
        System.out.println("Expected Count : "+c);
        System.out.println("Paid Entry : "+d);
        System.out.println("Projected Expense : "+e+"L");
    }
}