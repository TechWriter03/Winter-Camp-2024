import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt(),sum=0;
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            int curr=0,flag=0;
            for(int j=0;j<n;j++)
            {
                if(curr==sum-curr-arr[j])
                {
                    flag=1;
                    break;
                }
                curr+=arr[j];
            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}