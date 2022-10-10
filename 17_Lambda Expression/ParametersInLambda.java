@FunctionalInterface
interface MyLambda1{
    public void display(String str);
}

interface MyLambda2{
    public int add(int x, int y);
}

public class ParametersInLambda {
    public static void main(String[] args){
        MyLambda1 n =(s) -> {System.out.println(s);};
        n.display("Java Programming!");

        MyLambda2 o = (a, b) -> a+b;
        int r = o.add(50, 60);
        System.out.println(r);
    }
}
