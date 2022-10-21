import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class YourFrame8 extends Frame implements KeyListener {
    Label lb1,lb2,lb3,lb4;

    public YourFrame8() {
        super("Key Event");
        lb1 = new Label("");
        lb2 = new Label("");
        lb3 = new Label("");
        lb4 = new Label("");

        //setLayout(null);

        lb1.setBounds(30,10,100,20);
        lb2.setBounds(30, 40,100,20);
        lb3.setBounds(30,70,100,20);
        lb4.setBounds(30,110,200,20);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        lb1.setText("key Pressed");
        lb2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        lb2.setText("key Released");
        lb1.setText("");
        lb3.setText("");
        lb4.setText("");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lb3.setText("key Typed");
        lb4.setText(new Date(ke.getWhen())+"");

    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        YourFrame8 fm8 = new YourFrame8();
        fm8.setSize(500, 400);
        fm8.setVisible(true);
    }
}
