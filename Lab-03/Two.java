import java.util.*;
public class Two
{
    static int fibo(int n)
    {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        return fibo(n-1)+fibo(n-2)+fibo(n-3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fibo(n-1));
    }
}