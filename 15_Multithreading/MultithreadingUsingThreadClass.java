class MyThread extends Thread{
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+" Hello!");
            i++;
        }
    }
}
public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        int i = 1;

        while (true){
            System.out.println(i + " World!");
        }
    }
    // this program not stop until and unless you can not stop it!
}



/*

---------------------// Use Thread class made yourself//-----------------

public class MultithreadingUsingThreadClass extends Thread {
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingThreadClass t = new MultithreadingUsingThreadClass();
        t.start();
        int i = 1;

        while (true){
            System.out.println(i + " World!");
        }
    }
    // this program not stop until and unless you can not stop it!
}

 */

