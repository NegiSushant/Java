public class Main {
    public static void main(String[] args) {

        int A[][] = new int[5][5];
        int B[][] = {{1,3,5},{2,4,6},{5,8,11}};

//        int C[][] = new int [5][5];
//
//        int []D[] = new int[5][5];
//
//        int [] E,F[];
//        E=new int[6];
//        F=new int[6][6];

    //FOR LOOP
//          for(int i=0; i<B.length; i++){
//              for(int j=0; j<B[0].length; j++){
//                  System.out.print(B[i][j]+" ");
//              }
//              System.out.println("");
//          }

     // FOR EACH LOOP
            for(int x[]:B){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println("");
            }
    }
}