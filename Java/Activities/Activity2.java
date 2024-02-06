package Activities;

import java.sql.Array;

public class Activity2 {
    public static void main(String[] args)
    {
        int[] numbers = {10, 77, 10, 54, -11, 10};
        boolean result = valueCheck(numbers, 10, 30);
        System.out.println("Result is "+ result);
    }
    public static boolean valueCheck(int[] numbers, int searchNumber, int expectedSum)
    {
        int sum = 0;
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i] == searchNumber)
                sum = sum + numbers[i];
        }
        if(sum == expectedSum)
            return true;
        return false;
    }
}
