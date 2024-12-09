import java.util.*;
public class Two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%12==0)
            System.out.print("Monkey");
        else if(n%12==1)
            System.out.print("Rooster");
        else if(n%12==2)
            System.out.print("Dog");
        else if(n%12==3)
            System.out.print("Pig");
        else if(n%12==4)
            System.out.print("Rat");
        else if(n%12==5)
            System.out.print("Ox");
        else if(n%12==6)
            System.out.print("Tiger");
        else if(n%12==7)
            System.out.print("Hare");
        else if(n%12==8)
            System.out.print("Dragon");
        else if(n%12==9)
            System.out.print("Snake");
        else if(n%12==10)
            System.out.print("Horse");
        else if(n%12==11)
            System.out.print("Sheep");
    }
}