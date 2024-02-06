package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)
    {
        ArrayActivities();
    }
    static void ArrayActivities()
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("KK"); myList.add("Sonu");
        myList.add("Shaan"); myList.add("Sunidhi");
        myList.add("Arijit");
        //Printing all elements in list
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
        for (String s: myList)
        {System.out.println(s);}
        //Get 3rd name in the list
        System.out.println(myList.get(3));
        //Check name in the list
        if(myList.contains("KK"))
            System.out.println("Given name is present on the list");
        else System.out.println("Given name is not present on the list");
        //remove any element from the list
        System.out.println("Before removing element from the list, Size = "+myList.size());
        myList.remove(3);
        System.out.println("After removing element from the list, Size = "+myList.size());
    }

}
