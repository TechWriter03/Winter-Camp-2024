import java.util.*;
public class Main3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(str1.length()+" "+str2.length());
        System.out.println(str1+str2);
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        char temp=s1[0];
        s1[0]=s2[0];
        s2[0]=temp;
        System.out.print(s1[0]);
        for(int i=1;i<s1.length;i++)
            System.out.print(s1[i]);
        System.out.print(" ");
        System.out.print(s2[0]);
        for(int i=1;i<s2.length;i++)
            System.out.print(s2[i]);
    }
}