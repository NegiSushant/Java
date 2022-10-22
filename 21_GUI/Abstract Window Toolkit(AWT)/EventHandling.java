import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame02 extends Frame {
    //    class MyFrame02 extends Frame implements ActionListener {
    TextField tf;
    Button b;
    int count = 0;

    MyFrame02() {
        super("Event Handling");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

//        b.addActionListener(this);
        //b.addActionListener(new MyListener());

/*--------USing Anonymous/Local Class-----------------*/
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                count++;
//                tf.setText(String.valueOf(count));
//            }
//        });

        /*--------Using Lambda Expression---------------*/
        b.addActionListener((ActionEvent ae)->
        {count++;tf.setText(String.valueOf(count));});
//
    }

//    class MyListener implements ActionListener {
//        public void actionPerformed(ActionEvent ae) {
//            count++;
//            tf.setText(String.valueOf(count));
//        }
//    }

//    public void actionPerformed(ActionEvent ae){
//        count++;
//        tf.setText(String.valueOf(count));
//    }

}
public class EventHandling {
    public static void main(String[] args) {
        MyFrame02 mf02 = new MyFrame02();
        mf02.setSize(500, 430);
        mf02.setVisible(true);
    }
}
