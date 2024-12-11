import java.util.*;
public class Main1
{
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s=sc.next();
            char str[]=s.toCharArray();
            int count=0;
            for(int j=0;j<str.length;j++)
            {
                char ch=str[j];
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||  ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    count++;
            }
            System.out.println(count);
        }
    }
}