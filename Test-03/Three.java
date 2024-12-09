import java.util.*;
public class Three
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            int r=n%10;
            if(r==8)
                c+=2;
            else if(r==0 || r==4 || r==6 || r==9)
                c++;
            n/=10;
        }
        System.out.print(c);
    }
}