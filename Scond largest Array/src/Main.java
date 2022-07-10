public class Main {
    public static void main(String[] args) {

        int A[] = {22, 4,6, 7, 12, 55, 6};

        int max1;
        int max2;
        max1 = max2 =A[0];

        for( int i=0; i< A.length; i++){
            if(A[i] > max1){
                max2=max1;
                max1=A[i];
            }
            else if( A[i] > max2){
                max2 = A[i];
            }
        }
        System.out.println("Second largest element is: "+max2);
    }
}