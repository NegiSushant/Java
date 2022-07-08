import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a, b, c;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the values of a, b and c ");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();



        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}