import java.io.*;

class Students{
    int rollno;
    String name;
    String dept;
}

public class PrintStreams {
    public static void main(String[] args) throws Exception {

        /*-------------Writing the data------------------------*/
        FileOutputStream pos = new FileOutputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Student1.txt");
        PrintStream ps = new PrintStream(pos);

        Students s = new Students();
        s.rollno = 10;
        s.name =  "Ashish";
        s.dept = "MCA";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        /*-------------Reading the data------------------------*/
        FileInputStream pis = new FileInputStream("D:/Java Exercise/02_Java Course/18_Java Input Output Stream/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(pis));

        Students s1 = new Students();
        s1.rollno = Integer.parseInt(br.readLine());
        s1.name = br.readLine();
        s1.dept = br.readLine();

        System.out.println("Roll num: "+s1.rollno);
        System.out.println("Name: "+s1.name);
        System.out.println("Dept: "+s1.dept);

        ps.close();
        pos.close();

    }
}
