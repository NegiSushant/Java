public class MultipleTryCatchBlocks {
    public static void main(String[] args) {
        int[] a = {30, 20, 10, 40, 0};

        try {
            int c = a[0]/a[1];

            System.out.println("Division is "+ c);
            System.out.println(a[3]);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is Invalid.");
        }
        System.out.println("Bye!");
    }
}
