class Rectangle{

    private double length;
    private double breath;

    public Rectangle(){
        length = 1;
        breath = 1;
    }

    public Rectangle(double l, double b){
        length = l;
        breath = b;
    }

    public Rectangle(double s){
        length=breath=s;
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();// <-- give the values.

        //System.out.println("Hello world!");
    }
}