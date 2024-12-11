import java.util.*;
class Movie
{
    // Movie name
    String name="";
    // Collections amount
    int collections;
    // Method to change the movie name by appending new string
    public void changeName(String namePart) {
        this.name += namePart;
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner sc=new Scanner(System.in);
        // Read initial movie name 
        String name1=sc.next();
        // Create Movie object
        Movie mov=new Movie();
        mov.name=name1;
        System.out.println("myMovie.movieName = "+mov.name);
        // Change name based on user input
        String newName=sc.next();
        mov.changeName(newName);
        // Output the changed name
        System.out.println("myMove.changeName("+newName+")");
        System.out.println("myMovie.movieName = "+mov.name);
        // Close the scanner
        sc.close();
    }
}