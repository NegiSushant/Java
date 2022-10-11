import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class AssignmentCopyingFiles {
    public static void main(String[] args) throws Exception
    {
//        try (FileOutputStream fos = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Source1.txt");)
//        {
//            String str = "Hello I am learning Java Programming." +
//                    "It is one the computer languages!" +
//                    "I more interested to learn java any other languages!";
//            byte b[] = str.getBytes();
//            fos.write(b);
//        }
//        try (FileOutputStream fos = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Source2.txt");)
//        {
//            String str = "I am solving DSA question from leetcode using java language! " +
//                    "I am thank full to the kunal kuswaha who teach me DSA.";
//            byte c[] = str.getBytes();
//            fos.write(c);
//        }

//        FileInputStream fis1=new FileInputStream("Source1.txt");
//        FileOutputStream fos1=new FileOutputStream("Source2.txt");
//
//        int b;
//        while((b=fis1.read())!=-1)
//        {
//            if(b >= 65 && b <= 90){
//                fos1.write(b+32);
//            }else{
//                fos1.write(b);
//            }
//        }
//        fis1.close();
//        fos1.close();

        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");

        FileOutputStream fos1=new FileOutputStream("Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);


        int b;
        while((b = sis.read()) != -1)
        {

            fos1.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos1.close();
    }
}
