package Activities;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args)
    {
        Plane plane = new Plane(10);
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        //Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int passengerValue)
    {
        maxPassengers = passengerValue;
        passengers = new ArrayList<>();
    }
    public void onboard(String passenger)
    {
        passengers.add(passenger);
    }
    public Date takeOff()
    {
        lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land()
    {
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded()
    {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
