import java.util.Scanner;

class Cylinder{

    private double radius;
    private  double height;

    public Cylinder(){
        radius = height =1;
    }

    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public void setHeight(double h) {
        if (h>=0)
            height=h;
        else
            height=0;
    }

    public void setRadius(double r) {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }

    public void setDimensions(double h, double r){
        height = h;
        radius = r;
    }

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double drumArea(){
        return 2*lidArea()+perimeter()*height;
    }

    public double volume(){
        return lidArea()*height;
    }
}

public class Main {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height: ");
        c.setHeight(sc.nextDouble());
        c.setRadius(sc.nextDouble());

        System.out.println("Enter the Dimensions height and radius: ");
        c.setDimensions(sc.nextDouble(), sc.nextDouble());

        System.out.println("LidArea: "+c.lidArea());
        System.out.println("Circumference: "+c.perimeter());
        System.out.println("total Surface Area: "+c.drumArea());
        System.out.println("Volume: "+c.volume());
        System.out.println("Height: "+c.getHeight());
        System.out.println("Radius: "+c.getRadius());
    }
}