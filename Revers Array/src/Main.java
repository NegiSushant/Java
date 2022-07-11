import java.util.Scanner;

public class Main {
    // Reverse Number
    static int reverse(int n){
        int rev=0;

        while (n!=0){
            rev=rev*10+n%10;
            n=n/2;
        }
        return rev;
    }

    //Reverse Array

    static int [] reverse (int A[]){
        int [] B = new int [A.length];

        for (int i = A.length-1, j =0; i>=0;  i--, j++) {
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
// Something went wrong in Calling Function
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or Array");
        int n = sc.nextInt();
        int A = sc.nextInt();
        System.out.println("reverse number is "+reverse(n));

        //System.out.println("Enter the Array ");

        System.out.println("reverse Array is "+reverse(A));



        //System.out.println("Hello world!");
    }
}