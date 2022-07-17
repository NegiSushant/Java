class Car
{
    public void start()
    {
        System.out.println("Car Started");
    }
    public void accelerate()
    {
        System.out.println("Car is Accelerated");
    }
    public void changeGear()
    {
        System.out.println("Car Gear Changed");
    }

}

class LuxuryCar extends Car
{
    public void changeGear()
    {
        System.out.println("Automatic Gear");
    }
    public void openRoof()
    {
        System.out.println("Sun Roof is Opened");
    }

}

public class Main
{

    public static void main(String[] args)
    {
        LuxuryCar c=new LuxuryCar();
        c.openRoof();
        c.start();
        c.accelerate();
        c.changeGear();

    }

}