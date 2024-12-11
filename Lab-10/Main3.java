import java.util.*;
public class Main3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=(n*(n+1))/2,curr=0;
        for(int i=0;i<n;i++)
            curr+=sc.nextInt();
        System.out.print(sum-curr);
    }
}