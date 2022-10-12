import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArray {
    public static void main(String[] args) throws Exception
    {
        /*----------------------Char Array Reader---------------------*/
        char c[]={'a','b','c','d','e','f','g','h','i','j'};

        CharArrayReader cr=new CharArrayReader(c);

        int x;

        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);

        }
        cr.close();

        /*----------------------Char Array Reader---------------------*/
        System.out.println(" ");
        CharArrayWriter cw = new CharArrayWriter(30);

        cw.write('s');
        cw.write('u');
        cw.write('s');
        cw.write('h');
        cw.write('a');
        cw.write('n');
        cw.write('t');

        char[] d = cw.toCharArray();
        for (char z : d){
//            System.out.print(z);
            System.out.println((char) z);
        }
        cw.close();
    }
}
