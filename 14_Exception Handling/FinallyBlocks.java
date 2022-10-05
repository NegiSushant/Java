public class FinallyBlocks {
    public static void main(String[] args) throws Exception {
        try{
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        // if we have try block and catch block then we don't need final block.
        finally {
            System.out.println("Final Message");
        }
    }
}
