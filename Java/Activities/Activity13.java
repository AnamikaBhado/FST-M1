package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
//}
//class RandomScannerActivity
//{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<Object>();
        Random indexGen = new Random();
        while (scan.hasNextInt())
        {list.add(scan.nextInt());}

        Integer nums[] = list.toArray(new Integer[5]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + nums[index]);

        scan.close();
    }
}
