import java.io.FileInputStream;

class LowBalanceException extends Exception{

    @Override
    public String toString() {
        return "Balance should not less than 5000!";
    }
}

public class CheckedException {
    static void fun1(){
        try{
            throw new LowBalanceException();
        }
        catch (LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }

    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
