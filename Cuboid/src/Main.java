import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        int totalArea, volume;

        System.out.println("Enter Length breath and height ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        totalArea = 2*(length*breadth + breadth*height + height*length);

        volume = (length*breadth*height);

        System.out.println("Total area "+totalArea);
        System.out.println("Volume "+volume);

    }
}