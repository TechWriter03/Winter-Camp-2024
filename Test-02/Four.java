import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n%=296;
        if(n%10==0)
            System.out.print("Sunday");
        else if(n%10==1)
            System.out.print("Monday");
        else if(n%10==2)
            System.out.print("Tuesday");
        else if(n%10==3)
            System.out.print("Wednesday");
        else if(n%10==4)
            System.out.print("Thursday");
        else if(n%10==5)
            System.out.print("Friday");
        else if(n%10==6)
            System.out.print("Saturday");
        else if(n%10==7)
            System.out.print("Kryptonday");
        else if(n%10==8)
            System.out.print("Coluday");
        else if(n%10==9)
            System.out.print("Daxamday");
    }
}