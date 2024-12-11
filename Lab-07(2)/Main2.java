import java.util.*;
class InvalidAgeForDrivingLicenseException extends Exception
{
    InvalidAgeForDrivingLicenseException(String msg)
    {
        super(msg);
    }
}
class InvalidMarkForDrivingLicenseException extends Exception
{
    InvalidMarkForDrivingLicenseException(String msg)
    {
        super(msg);
    }
}
public class Main2
{
    static void validate(int age,int mark) throws InvalidAgeForDrivingLicenseException, InvalidMarkForDrivingLicenseException
    {
        if(age<0 || age>100)
            throw new InvalidAgeForDrivingLicenseException("Invalid age");
        else if(age<18)
            throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
        if(mark<0 || mark>100)
            throw new InvalidMarkForDrivingLicenseException("Invalid mark");
        else if(mark<80)
            throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
        System.out.print("Approved");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int mark=sc.nextInt();
        try
        {
            validate(age,mark);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}