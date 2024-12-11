import java.util.*;
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            char mat[][]=new char[n][n];
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    mat[j][k]='*';
            int col=0;
            for(int j=0;j<n;j++)
            {
                int row=sc.nextInt();
                mat[row][col]='#';
                col++;
            }
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    System.out.print(mat[j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}