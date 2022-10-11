import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutput {
    public static void main(String[] args) throws Exception {

        /*----------------for making Test file--------------------*/
        try (FileOutputStream fos = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Test.txt");)
        {
            String str = "Hello I am learning Java Programming.";
            byte b[] = str.getBytes();
            fos.write(b);
        }

        /*----------------for making Test file--------------------*/
//        try{
//            FileOutputStream fos = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Test.txt");
//            String str = "Hello I am learning Java Programming.";
//
//            byte b[] = str.getBytes();
//
////            fos.write(b, 6, str.length() - 6);
//
////            for (byte x: b ){
////                fos.write(x);
////            }
//
////            fos.write(str.getBytes());
//            fos.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }

        /*----------------for Reading for Test file--------------------*/
//        try (FileInputStream fis = new FileInputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Test.txt");)
//        {
//            byte b[] = new byte[fis.available()];
//            fis.read(b);
//
//            String str1 = new String(b);
//
//            System.out.println(str1);
//        }

        // Read Character by character
        try (FileInputStream fis = new FileInputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Test.txt");)
        {
            int x;
            while((x = fis.read())!=-1){
                System.out.print((char)x);
                //System.out.println((char)x);
            }
        }
    }
}
