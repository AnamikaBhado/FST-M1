package Activities;

public class Activity12 {
    public static void main(String[] args)
    {
        Addable add1 = (a,b) -> (a+b);
        System.out.println(add1.add(10,20));
        Addable add2 = (int a, int b) ->
        {
            return (a+b);
        };
        System.out.println(add2.add(10,10));
    }
}
interface Addable
{
    int add(int num1,int num2);
}
