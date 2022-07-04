class Outer 
{
  int x=10;
  static int y=20;

  static class My{
    public void show(){
      System.out.println(y);
      ///System.out.println(x);
    }
  }

public class StaticInner{
  public static void main(String[] args) 
  {
    Outer.My m=new Outer.My();
    m.show();
  }
}
}