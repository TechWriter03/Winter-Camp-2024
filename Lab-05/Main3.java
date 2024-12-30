import java.util.*;
public class Main3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char mat[][]=new char[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.next().charAt(0);
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j+1<n && mat[i][j]=='#' && mat[i][j+1]=='#')
                {
                    flag=1;
                    break;
                }
                if(i+1<m && mat[i][j]=='#' && mat[i+1][j]=='#')
                {
                    flag=1;
                    break;
                }
                if(i-1>=0 && mat[i][j]=='#' && mat[i-1][j]=='#')
                {
                    flag=1;
                    break;
                }
                if(j-1>=0 && mat[i][j]=='#' && mat[i][j-1]=='#')
                {
                    flag=1;
                    break;
                }
                if(i-1>=0 && j-1>=0 && mat[i][j]=='#' && mat[i-1][j-1]=='#')
                {
                    flag=1;
                    break;
                }
                if(i+1<m && j+1<n && mat[i][j]=='#' && mat[i+1][j+1]=='#')
                {
                    flag=1;
                    break;
                }
                if(i-1>=0 && j+1<n && mat[i][j]=='#' && mat[i-1][j+1]=='#')
                {
                    flag=1;
                    break;
                }
                if(i+1<m && j-1>=0 && mat[i][j]=='#' && mat[i+1][j-1]=='#')
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                break;
        }
        if(flag==1)
            System.out.print("Attack");
        else
            System.out.print("Safe");
    }
}