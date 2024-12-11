import java.util.Scanner;
public class Movie
{
    // Data members
    String movieName;
    int collections;
    // Method to add to the collections
    void addCollections(int n)
    {
        this.collections+=n;
    }
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        // Create a new movie object
        Movie mov=new Movie();
        mov.collections=m;
        System.out.println("myMovie.collections = "+mov.collections);
        // Prompt and read the additional collections to add
        int n=sc.nextInt();
        // Add additional collections to the movie
        mov.addCollections(n);
        System.out.println("myMove.addCollections("+n+")");
        System.out.println("myMovie.collections = "+mov.collections);
        // Close the scanner object
        sc.close();
    }
}