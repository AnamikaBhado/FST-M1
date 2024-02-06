package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args)
    {
        int[] numbers = {51,23,56,11,46,10,44};
        int[] array = sortArray(numbers);
        System.out.println(Arrays.toString(array));
    }
    public static int[] sortArray(int[] numbers)
    {
        int swap;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j=i+1; j< numbers.length; j++)
            {
                if(numbers[i] > numbers[j])
                {
                    swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
        return numbers;
    }
}
