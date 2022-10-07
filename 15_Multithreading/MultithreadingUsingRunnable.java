public class MultithreadingUsingRunnable implements Runnable {
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+" Hello!");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingRunnable t = new MultithreadingUsingRunnable();
        Thread th = new Thread(t);

        th.start();
        int i = 1;

        while (true){
            System.out.println(i + " World!");
        }
    }
}


/*
---------------------// Use Runnable class made yourself//-----------------

class MyRunnable implements Runnable{
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+" Hello!");
            i++;
        }
    }
}
public class MultithreadingUsingRunnable {
    public static void main(String[] args) {
        MyRunnable t = new MyRunnable();
        Thread th = new Thread(t);

        th.start();
        int i = 1;

        while (true){
            System.out.println(i + " World!");
        }
    }

    // this program not stop until and unless you can not stop it!
}

 */

