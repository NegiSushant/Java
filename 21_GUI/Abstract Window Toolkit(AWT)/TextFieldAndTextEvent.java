import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class YourFrame1 extends Frame{
    Label l1, l2;
    TextField txf;

    YourFrame1(){
        super("Text Field");

        l1 = new Label("No Text is Entered yet");
        l2 = new Label("Enter key is not yet hit");
        txf = new TextField(20);
        txf.setEchoChar('*');

        Handler h = new Handler();

        txf.addTextListener(h);
        txf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(txf);

    }



    class Handler implements TextListener, ActionListener{
        public void actionPerformed(ActionEvent e) {
            l2.setText(txf.getText());
        }

        public void textValueChanged(TextEvent e) {
            l1.setText(txf.getText());
        }
    }
}

public class TextFieldAndTextEvent {
    public static void main(String[] args){
        YourFrame1 fm1 = new YourFrame1();
        fm1.setSize(500, 500);
        fm1.setVisible(true);
    }
}
