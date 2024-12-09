import java.util.*;
public class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();
            for(int j=0;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[j]+arr[k]==m)
                    {
                        System.out.println((j+1)+" "+(k+1));
                        break;
                    }
                }
            }
        }
    }
}