package Activities;

public class Activity7 {
}
interface BicycleParts
{
    public int gears = 0;
    public int speed = 0;
}
interface BicycleOperations
{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations
{
    public int gears, currentSpeed;
    Bicycle(int gears, int currentSpeed)
    {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    public void applyBrake(int value)
    {
        currentSpeed = currentSpeed - value;
    }
    public void speedUp(int value)
    {
        currentSpeed = currentSpeed + value;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
/*class MountainBike extends Bicycle
{
    int seatHeight;
   /* MountainBike(int height)
    {
        super(int gears, int currentSpeed);
        seatHeight = height;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

}*/