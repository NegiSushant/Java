import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        String str=new String("   Intellij   ");

        int len=str.length();
        System.out.println(len);

        String str2=str.toUpperCase();
        System.out.println(str2);

        String str3 = str.trim();
        System.out.println(str3);

        String str4 = str.substring(3,8);
        System.out.println(str4);

        String str5 = str.replace('i', 'M');
        System.out.println(str5+ " " +str);


    }
}