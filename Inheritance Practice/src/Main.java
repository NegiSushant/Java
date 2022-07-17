import java.util.Scanner;

class Circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius & height: ");

        Cylinder c=new Cylinder();

        c.radius = sc.nextDouble();
        c.height = sc.nextDouble();

        System.out.println("Volume: "+c.volume());
        System.out.println("Area: "+c.area());

    }
}