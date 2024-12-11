import java.util.*;
class Hall
{
    String name;
    String contact;
    double cost;
    String owner;
    Hall(String name,String contact,double cost,String owner)
    {
        this.name=name;
        this.contact=contact;
        this.cost=cost;
        this.owner=owner;
    }
    void display()
    {
        System.out.printf("%-20s%-20s%-20s%-20s",name,contact,cost,owner);
        System.out.println();
    }
}
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<Hall>ls=new ArrayList<Hall>();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            String contact=sc.nextLine();
            double cost=sc.nextDouble();
            sc.nextLine();
            String owner=sc.nextLine();
            ls.add(new Hall(name,contact,cost,owner));
        }
        int ind=sc.nextInt();
        if(!ls.isEmpty())
        {
            ls.remove(ind);
            System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","CostperDay","Owner Name");
            for(int i=0;i<n-1;i++)
                ls.get(i).display();
        }
        else
        {
            System.out.print("The list is empty");
        }
    }
}