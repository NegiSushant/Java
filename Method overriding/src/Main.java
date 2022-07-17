class Super{
    public void display(){
        System.out.println("Super Class Display.");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub Class Display.");
    }
}

public class Main {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();

        Sub su = new Sub();
        su.display();

        Super sup = new Sub();
        sup.display();
    }
}