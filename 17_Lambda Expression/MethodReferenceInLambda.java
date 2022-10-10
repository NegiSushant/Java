@FunctionalInterface
interface MyLambda3
{
    public void display(String str);
}

public class MethodReferenceInLambda {
    /*------Reverse the String Using Static Method--------------*/
    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    /*------Reverse the String Using non-static method--------------*/
//    public void reverse1(String str){
//        StringBuffer sc = new StringBuffer(str);
//        sc.reverse();
//        System.out.println(sc);
//    }

    /*-----------Capital latter Using Constructor--------------*/
    public MethodReferenceInLambda(String str1){
        System.out.println(str1.toUpperCase());
    }

    public static void main(String[] args) {

        MyLambda3 p=System.out::println;
        p.display("Hello!");

        /*------Reverse the String Using Static Method--------------*/
        MyLambda3 ml = MethodReferenceInLambda::reverse;
        ml.display("Hello World!");

        /*------Reverse the String Using non-static method--------------*/
//        MethodReferenceInLambda ld = new MethodReferenceInLambda();
//        MyLambda3 ml1 = ld::reverse1;
//        ml1.display("Hello world, how are you!");

        /*---------Capital latter Using Constructor--------------*/
        MyLambda3 ml2 = MethodReferenceInLambda :: new;
        ml2.display("whats going on?");
    }
}
