import java.util.*;
public class Two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
            arr[i]=sc.nextInt();
        int n=sc.nextInt();
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
            brr[i]=sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(arr[i]==brr[j])
            {
                i++;
                j++;
            }
            else if(arr[i]<brr[j])
            {
                System.out.print(arr[i]+" ");
                i++;
            }
            else
            {
                System.out.print(brr[j]+" ");
                j++;
            }
        }
        System.out.println();
    }
}