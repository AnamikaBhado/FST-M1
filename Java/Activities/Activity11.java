package Activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args)
    {
        MapActivities();
    }
    static void MapActivities()
    {
        HashMap<Integer,String> colors = new HashMap<Integer,String>() ;
        colors.put(1,"Green");
        colors.put(2,"Yellow");
        colors.put(3,"Red");
        colors.put(4,"Blue");
        colors.put(5,"Black");
        System.out.println("HashMap elements are: "+colors);
        //Remove a color from the set
        colors.remove(4);
        if(colors.containsValue("Green"))
            System.out.println("Green color is present on the list");
        else System.out.println("Green color is not present on the list");
        System.out.println("Size of the HashMap is = "+colors.size());

        System.out.println("HashMap elements are: "+colors);

    }
}
