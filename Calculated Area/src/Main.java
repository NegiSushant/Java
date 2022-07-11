import java.util.Scanner;

public class Main {

    static double area(double radius){
        return Math.PI*radius*radius;
    }

    static double area(double length, double breadth){
        return length*breadth;

    }

    static double perimeter(double length, double breadth){
        return 2*(length + breadth);
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter length & breadth OR radius ");

        double length = in.nextDouble();
        double breadth = in.nextDouble();

        double radius = in.nextDouble();

        System.out.println(area(length, breadth));
        System.out.println(perimeter(length, breadth));
        System.out.println(area(radius));


    }
}