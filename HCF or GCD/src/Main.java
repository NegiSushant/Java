import java.util.Scanner;

public class Main {

    static int Gcd(int m, int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m and n ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Gcd(m,n));
    }
}