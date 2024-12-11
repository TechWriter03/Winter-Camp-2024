class Series
{
    int n;
    int[] elements;
}
public class Main1
{
    public static void main(String[] args)
    {
        Series fibonacci=new Series();
        fibonacci.n=10;
        fibonacci.elements=new int[]{1,1,2,3,5,8,13,21,34,55};
        System.out.println("First " + fibonacci.n + " elements of Fibonacci are:");
        for(int i = 0; i<fibonacci.elements.length; i++)
            System.out.print(fibonacci.elements[i]+" ");
    }
}