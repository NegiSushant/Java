import java.io.*;

class Student1{
    int rollno;
    String name;
    String dept;
    float avg;
}

public class DataStreams {
    public static void main(String[] args) throws Exception {

        /*-------------Writing the data------------------------*/
        FileOutputStream fod = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fod);

        Student1 s2 = new Student1();
        s2.rollno = 12;
        s2.name = "Rahul";
        s2.dept = "CSE";
        s2.avg = 76.5f;

        dos.writeInt(s2.rollno);
        dos.writeUTF(s2.name);
        dos.writeUTF(s2.dept);
        dos.writeFloat(s2.avg);


        /*-------------Reading the data------------------------*/
        FileInputStream fid = new FileInputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Student2.txt");
        DataInputStream dis = new DataInputStream(fid);

        Student1 s3 = new Student1();
        s3.rollno = dis.readInt();
        s3.name = dis.readUTF();
        s3.dept = dis.readUTF();
        s3.avg = dis.readFloat();

        System.out.println("Roll no: "+s3.rollno);
        System.out.println("Name: "+s3.name);
        System.out.println("Department: "+s3.dept);
        System.out.println("Average: "+s3.avg);

        dos.close();
        fod.close();

    }
}
