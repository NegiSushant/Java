import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WelCome to A.P. Series.");
        int a;
        int d;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, d and n ");

        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();

        int term = a;
        for (int i=0; i<n; i++) {
            System.out.print(term + ",");
            term = term + d;

        // For G.P. Series
        //for(int i=0; i<n; i++) {
            //System.out.print(term+ ",");
            //term = term * d;
        }
    }
}

