import java.util.*;
public class Main2
{
    static boolean isReverse(String s,String t)
    {
        int m=s.length(),n=t.length();
        int i=0,j=n-1;
        while(i<m && j>=0)
        {
            if(s.charAt(i)!=t.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
            str[i]=sc.next();
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isReverse(str[i],str[j]))
                {
                    int len=str[i].length();
                    System.out.print(len+" "+str[i].charAt(len/2));
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                break;
        }
    }
}