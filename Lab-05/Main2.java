import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up=(i-1>=0)?mat[i-1][j]:-1;
                int down=(i+1<m)?mat[i+1][j]:-1;
                int left=(j-1>=0)?mat[i][j-1]:-1;
                int right=(j+1<n)?mat[i][j+1]:-1;
                int ele=mat[i][j];
                if(ele>up && ele>down && ele>left && ele>right)
                    count++;
            }
        }
        System.out.print(count);
    }
}