import java.util.*;
public class Four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int curr=0;
        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            if(curr==sum-curr)
            {
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");
        return;
    }
}