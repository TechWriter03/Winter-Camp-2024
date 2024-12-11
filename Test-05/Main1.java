import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        int zeros=0,ones=0;
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            if(arr[i][0]==0)
                zeros++;
            else
                ones++;
        }
        int male[]=new int[ones];
        int female[]=new int[zeros];
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i][0]==1)
                male[x++]=arr[i][1];
            else
                female[y++]=arr[i][1];
        }
        Arrays.sort(male);
        Arrays.sort(female);
        for(int i=zeros-1;i>=0;i--)
            System.out.print(female[i]+" ");
        for(int i=ones-1;i>=0;i--)
            System.out.print(male[i]+" ");
    }
}