import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner mp = new Scanner(System.in);
        System.out.println("Enter the number. ");

        n = mp.nextInt();

        int m = n;
        int sum = 0;
        int r;

        while (n>0) {

            r = n % 10;
            n = n / 10;

            sum = sum +r*r*r;

        }
        if (sum == m) {
            System.out.println(m+" is an Armstrong Number.");
        }
        else{
            System.out.println(m+" is Not an Armstrong Number.");
        }
    }
}