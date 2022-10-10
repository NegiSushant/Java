@FunctionalInterface
interface MyLambda{
    public void display();
}

//class My implements MyLambda{
//    public void display(){
//        System.out.println("Hello world!");
//    }
//}

public class LambdaExpression {
    public static void main(String[] args){
        MyLambda m =() -> //This is Lambda expression.
        {
                System.out.println("Hello world!");
        };
        m.display();
    }
}
