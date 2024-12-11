import java.util.*;
public class Main1
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
        int maxLen=0;
        int dir[][]={{0,1},{1,0},{1,1},{1,-1}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]=='V')
                {
                    for(int d[]:dir)
                    {
                        int len=getLongSeq(mat,i,j,d[0],d[1]);
                        maxLen=Math.max(len,maxLen);
                    }
                }
            }
        }
        System.out.print(maxLen);
    }
    static int getLongSeq(char mat[][],int x,int y,int dx,int dy)
    {
        int len=0;
        while(x>=0 && x<mat.length && y>=0 && y<mat[0].length && mat[x][y]=='V')
        {
            len++;
            x+=dx;
            y+=dy;
        }
        return len;
    }
}