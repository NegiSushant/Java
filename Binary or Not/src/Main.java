//Find if a number is Binary or Not.?

public class Main
{
    public static void main(String[] args)
    {
        int b = 1000110;
        int c = 1080011;

        String str = String.valueOf(b);
        String str1 = String.valueOf(c);

        System.out.println(str.matches("[01]+"));
        System.out.println(str1.matches("[01]+"));
    }
}