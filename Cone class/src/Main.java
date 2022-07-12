import java.util.Scanner;

class Cone{
    public double radius;
    public double height;

    public double sheight(){
        return Math.sqrt(radius*radius + height*height);
    }
    public double surface(){
        return Math.PI*radius*(radius + sheight());
    }

    public double lsurface(){
        return Math.PI*radius*sheight();
    }

    public double volume(){
        return (Math.PI*radius*radius*height)/3;
    }

    public double Barea(){
        return Math.PI*radius*radius;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius & Height ");
        Cone c1 = new Cone();

        c1.radius = sc.nextDouble();
        c1.height = sc.nextDouble();

        System.out.println("Slant height: "+c1.sheight());
        System.out.println("Surface Area: "+c1.surface());
        System.out.println("Leteral Surface Area: "+c1.lsurface());
        System.out.println("Volume :"+c1.volume());
        System.out.println("Base area: "+c1.Barea());


    }
}