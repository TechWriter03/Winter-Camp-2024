import java.util.*;
public class Two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=n*n;
        int arr[]=new int[m];
        int p=0,zeros=n-1,nums=1;
        while(p<m)
        {
            for(int i=1;i<=zeros;i++)
                arr[p++]=0;
            zeros--;
            for(int i=nums;i>=1;i--)
                arr[p++]=i;
            nums++;
        }
        for(int i=0;i<m;i++)
            System.out.print(arr[i]+" ");
    }
}