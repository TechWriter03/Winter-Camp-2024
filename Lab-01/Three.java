import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int child=(y-5*x)/13,adult=child+x,senior=child*2;
        System.out.println("Number of children tickets sold : "+child);
        System.out.println("Number of adult tickets sold : "+adult);
        System.out.println("Number of senior tickets sold : "+senior);
    }
}
