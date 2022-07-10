import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A[] = {10, 8, 6, 11, 23,};
        int key;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the key ");
        key =sc.nextInt();

        for(int i=0; i<A.length; i++){
            if(A[i]== key){
                System.out.println("key is found at "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}