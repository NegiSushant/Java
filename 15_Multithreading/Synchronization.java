class MyData {
    synchronized public void display(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {
    MyData d;
    public MyThread2(MyData d) {
        this.d=d;
    }

    public void run() {
        d.display("Hello World");
    }
}

class MyThread3 extends Thread {
    MyData d;
    public MyThread3(MyData d) {
        this.d=d;
    }

    public void run() {
        d.display("Welcome All");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        MyData data=new MyData();

        MyThread2 t1=new MyThread2(data);
        MyThread3 t2=new MyThread3(data);

        t1.start();
        t2.start();



    }
}
