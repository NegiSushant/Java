class MyRun implements Runnable{
    public void run(){

    }
}
/*----------Writing your own class using thread class----------*/

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }

    /*---------Sleep-----------*/
    public void run(){
        int count = 1;
        while (true){
            System.out.println(count++);
            try{
                Thread.sleep(1000);//Print will take time of 1000s to print next number.
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadClassConstructors {
    public static void main(String[] args) throws Exception{
        MyThread1 v = new MyThread1("My Thread 1");
        Thread t = new Thread("My Name");
        Thread s = new Thread(new MyRun(), "My Name");

        /*---------ID of Thread class--------*/
        System.out.println("ID: "+v.getId());
        System.out.println("Name: "+v.getName());
        System.out.println("Priority: "+v.getPriority());
        System.out.println("State: "+v.getState());
        System.out.println("Alive: "+v.isAlive());
        v.setDaemon(true); // it is dependent threat if the main class terminated so daemon threat also terminated.
        v.start(); // print sleep.
        v.interrupt();// interrupt method.
    }
}
