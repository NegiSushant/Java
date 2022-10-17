import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener {
    int count = 0;
    Label lb;
    Button bn;
    public MyFrame(){
        super("Button Demo");

        lb = new Label("   "+count);
        bn = new Button("Click me");
        bn.addActionListener(this);

        setLayout(new FlowLayout());

        add(lb);
        add(bn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        lb.setText(" "+count);
    }
}
public class ButtonAndActionListener {
    public static void main(String[] args){
        MyFrame1 fm = new MyFrame1();
        fm.setSize(400, 400);
        fm.setVisible(true);
    }
}
