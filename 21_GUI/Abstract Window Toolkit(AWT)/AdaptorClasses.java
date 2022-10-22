

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//Outer class for handling Window Event
/*

class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
}*/
class MyFrame01 extends Frame {
    MyFrame01() {
        super("Adapter");

        // use this for handling event using inner class
        //   addWindowLister(new MyWindowAdapter());

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    // Inner class used for handling event
   /* class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }*/
}
public class AdaptorClasses {
    public static void main(String[] args) {
        MyFrame01 mf01 = new MyFrame01();
        mf01.setSize(500, 400);
        mf01.setVisible(true);
    }
}
