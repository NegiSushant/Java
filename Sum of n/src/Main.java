import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number. ");
        n = sc.nextInt();

            int sum = 0;

        for(int i=1; i<=n; i++){

            sum = sum+i;
        }

        System.out.println("Sum of "+n+" Number is "+sum);
    }
}