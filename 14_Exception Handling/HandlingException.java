import java.util.Scanner;

public class HandlingException {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the two values: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            c = a/b;
            System.out.println(c);
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
        }
        catch (ArithmeticException e){ // e is exception object.
            System.out.println("Denominator should not be 0, try again.");
        }

        System.out.println("Bye");
    }
}
