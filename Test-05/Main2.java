import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[3][3];
        int count=0,sum1=0,sum2=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=sc.nextInt();
                if(count%2==0)
                    sum1+=mat[i][j];
                else
                    sum2+=mat[i][j];
                count++;
            }
        }
        System.out.println(sum1);
        System.out.print(sum2);
    }
}