import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String words[]=line.split(" ");
        for(int i=0;i<words.length;i++)
            System.out.println(words[i]);
    }
}