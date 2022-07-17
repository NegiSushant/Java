class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }

    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    public void meth2()//Overriding the Super class meth2.
    {
        System.err.println("Sub Meth2");
    }

    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Sub sup=new Sub();

        sup.meth1();
        sup.meth2();
        sup.meth3();

        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}