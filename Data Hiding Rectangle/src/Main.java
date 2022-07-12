import java.util.Scanner;

class Rectangle{

    private double length;
    private double breath;

// Reading Data
    public double getLength(){
        return length;
    }

    public double getBreath(){
        return breath;
    }

// Write Data
    public void setLength(double l){
        if (l>=0)
            length = l;
        else
            length = 0;

    }

    public void setBreath(double b){
        if(b>=0)
            breath = b;
        else
            breath = 0;
    }

    public double area(){
        return length * breath;
    }

    public double perimeter(){
        return 2*(length + breath);
    }

    public boolean isSquare(){
        return length == breath;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length & Breath ");
        Rectangle r = new Rectangle();

        r.setLength(sc.nextDouble());

        r.setBreath(sc.nextDouble());

        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of Rectangle: "+r.perimeter());
        System.out.println("It is a Square; "+r.isSquare());

        System.out.println("Length: "+r.getLength());
        System.out.println("Breath: "+r.getBreath());
    }
}