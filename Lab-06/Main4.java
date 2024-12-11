import java.util.*;
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char str[]=s.toCharArray();
        int map[]=new int[10];
        for(int i=0;i<str.length;i++)
            if(str[i]>='0' && str[i]<='9')
                map[str[i]-'0']++;
        for(int i=0;i<10;i++)
            System.out.print(map[i]+" ");
    }
}