import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.function.Consumer;

class Producer extends Thread {
    OutputStream os;
    public Producer(OutputStream o) {
        os=o;
    }

    public void run() {
        int count = 1;

        while(true) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer "+count);
                System.out.flush();

                Thread.sleep(10);
                count++;
            }catch(Exception e){}
        }
    }
}

class Consumer1 extends Thread {
    InputStream is;

    public Consumer1(InputStream s) {
        is=s;
    }

    public void run() {
        int x;
        while(true) {
            try {

                x=is.read();

                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);

            }catch(Exception e){}
        }
    }
}

public class PipedStreamed {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pos.connect(pis);

        Producer p=new Producer(pos);
        Consumer1 c=new Consumer1(pis);

        p.start();

        c.start();

    }
}
