import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=0,p=1;
        boolean f=false;
        while(n!=0)
        {
            int r=n%10;
            if(r==6)
                r=9;
            else if(r==9)
                r=6;
            else if(r==2 || r==3 || r==4 || r==5 || r==7)
                f=true;
            m+=r*p;
            p*=10;
            n/=10;
        }
        if(f)
            System.out.print("false");
        else if(m!=n)
            System.out.print("true");
    }
}