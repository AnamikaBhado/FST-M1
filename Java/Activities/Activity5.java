package Activities;

public class Activity5 {
    public static void main(String[] args)
    {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("NEW INDIA");
        System.out.println(newNovel.getTitle());
    }
}
abstract class Book {
    String title;
    public abstract void setTitle(String title);
    public String getTitle()
    {
        return title;
    }
}
class MyBook extends Book
{
    public void setTitle(String s) {
        title = s;
    }
}
