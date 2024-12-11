import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int map[]=new int[26];
        for(int i=0;i<s.length();i++)
            map[s.charAt(i)-'a']++;
        int flag=0;
        for(int i=0;i<26;i++)
        {
            if(map[i]==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print("true");
        else
            System.out.print("false");
    }
}