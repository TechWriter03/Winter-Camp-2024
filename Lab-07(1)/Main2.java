class Student
{
    boolean status;
    double frenchMarks;
    double chineseMarks;
}
public class Main2
{ 
    public static void main(String[] args)
    {
        Student myStudent=new Student();
        myStudent.status=true;
        myStudent.frenchMarks=92.0;
        myStudent.chineseMarks=76.0;
        if(myStudent.status)
        {
            System.out.println("Student has passed");
            System.out.println("She scored " + myStudent.frenchMarks + " in French");
            System.out.println("She scored " + myStudent.chineseMarks + " in Chinese");
        }
    }
}