import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=(n*(n+1))/2,p=0;
        int arr[]=new int[m];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                arr[p++]=j;
        for(int i=0;i<m;i++)
            System.out.print(arr[i]+" ");
    }
}