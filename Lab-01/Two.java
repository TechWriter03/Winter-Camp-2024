import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double branding=sc.nextDouble();
        double travel=sc.nextDouble();
        double food=sc.nextDouble();
        double logistics=sc.nextDouble();
        double total=branding+travel+food+logistics;
        System.out.printf("Total expenses : Rs.%.2f\n",total);
        System.out.printf("Branding expenses percentage : %.2f",branding/total*100);
        System.out.println("%");
        System.out.printf("Travel expenses percentage : %.2f",travel/total*100);
        System.out.println("%");
        System.out.printf("Food expenses percentage : %.2f",food/total*100);
        System.out.println("%");
        System.out.printf("Logistics expenses percentage : %.2f",logistics/total*100);
        System.out.println("%");
    }
}
