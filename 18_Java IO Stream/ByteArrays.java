import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrays {
    public static void main(String[] args) throws Exception
    {
        /*---------------Byte ArrayInput Stream-------------------*/
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        String str = new String(bis.readAllBytes());
        System.out.println(str);

        System.out.println(bis.markSupported());
        int x;

        while((x=bis.read())!=-1) {
            System.out.println((char)x);

        }
        bis.close();

        /*---------------Byte ArrayOutput Stream-------------------*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte[] c = bos.toByteArray();
        for (byte y : c){
            System.out.print((char) y);
            System.out.println(y);
        }

        bos.close();

    }
}
