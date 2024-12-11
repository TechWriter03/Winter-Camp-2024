class Movie
{
    String movieName;
    int collections;
}
public class Main3
{
    public static void main(String[] args)
    {
        Movie myMovie=new Movie();
        myMovie.movieName="Bourne Ultimatum";
        myMovie.collections=1000000;
        System.out.println("Movie name is: "+myMovie.movieName);
        System.out.println("Collections are: "+myMovie.collections);
    }
}