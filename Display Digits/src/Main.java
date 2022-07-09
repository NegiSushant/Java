import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number. ");
        n = sc.nextInt();

        int r;

        while (n > 0) {
            r = n%10;
            n = n/10;

            System.out.println(r);
        }
    }
}