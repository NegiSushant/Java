public class Main {
    public static void main(String[] args) {

        int A[][] = {{4, 7, 9},{3, 5, 7},{11, 13, 23}};
        int B[][] = {{2, 8, 10},{11, 15,17},{21, 13, 14}};

        int C[][] = new int[3][3];

        for(int i=0; i<A.length; i++){
            for (int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}