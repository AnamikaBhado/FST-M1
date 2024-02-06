package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)
    {HashSetActivities();}
    static void HashSetActivities()
    {
        HashSet<Object> myList = new HashSet<Object>();
        myList.add(10); myList.add("Mohan");
        myList.add("New Delhi"); myList.add(98.2);
        myList.add("Commerce"); myList.add("First");
        //Size of Hash Set
        System.out.println("Size of HashSet = "+myList.size());
        myList.remove(10);
        myList.remove("TATA");
        //Check an element in the list
        if(myList.contains("KK"))
            System.out.println("Given name is present on the list");
        else System.out.println("Given name is not present on the list");
        for(Object s: myList)
        {
            System.out.println(s);
        }
    }
}
