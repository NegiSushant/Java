package nestedinner;

class Outer 
{

  int x = 10;
  // static int x=10;
  //Inner i=new Inner();

  class Inner
  {
    int y = 20;

    public void inner Display()
    {
      System.out.println(x);
      System.out.println(y);
      
    }
  }

  public void outer Display()
  {
    Inner i=new Inner();
    i.inner Display();
    System.out.println(i.y);
  }
}

public class NestedInner {
  public static void main(String[] args)
  {
    //Outer o= new Outer();
    //o.outer Display();

    Outer.Inner oi=new.Outer().newInner();
    oi.inner Display();
  }
}