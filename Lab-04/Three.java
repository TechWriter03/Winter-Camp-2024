import java.util.*;
public class Three
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int ind=-1;
            for(int j=n-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                {
                    ind=j;
                    break;
                }
            }
            if(ind!=-1)
            {
                int k=i,len=0;
                while(k<n && ind>=0 && arr[k]==arr[ind])
                {
                    len++;
                    k++;
                    ind--;
                }
                maxLen=Math.max(len,maxLen);
            }
        }
        System.out.print(maxLen);
    }
}