import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class YourFrame2 extends Frame implements ActionListener {
    TextArea txa;
    TextField tfi;
    Label lbl;
    Button btn;

    YourFrame2() {
        super("TextArea Demo");

        lbl = new Label("No Text Entered!");
        txa = new TextArea(10,30);
        tfi = new TextField(20);
        btn = new Button("Click");

        setLayout(new FlowLayout());

        add(txa);
        add(lbl);
        add(tfi);
        add(btn);
        btn.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae) {
        lbl.setText(txa.getSelectedText());
        txa.append(tfi.getText());
        txa.insert(tfi.getText(), txa.getCaretPosition());

    }


}
public class TextAreaOperation {
    public static void main(String[] args) {
        YourFrame2 fm2 = new YourFrame2();
        fm2.setSize(500,500);
        fm2.setVisible(true);
    }
}
