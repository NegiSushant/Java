public class Main {
    public static void main(String[] args) {

        int A[] = {11, 13, 22, 8, 99, 113};

        int max = A[0];

        for(int i=0; i< A.length; i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(max);
    }
}