package Activities;

public class Activity8 {
    public static void main(String[] args)
    {
        try {
            exceptionTest("My Test");
            exceptionTest(null);
            exceptionTest("My World");
        }
        catch (CustomException ex)
        {System.out.println("Inside catch block: "+ex.message);}
    }
    static void exceptionTest(String str) throws CustomException
    {
        if(str == null)
            throw new CustomException("String is null");
        else
            System.out.println(str);
    }
}
class CustomException extends Exception
{
    String message;
    CustomException(String message)
    {
        this.message = message;
    }
    public String getMessage(String message)
    {return message;}
}
