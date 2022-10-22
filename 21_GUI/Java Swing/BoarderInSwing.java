import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class YourFrame03 extends JFrame {
    JLabel l;
    JTextField tf;
    JButton b;

    JPanel p;

    YourFrame03() {
        super("Boarders in Swing");

        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER,   TitledBorder.LEFT);
        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);
    }

}
public class BoarderInSwing {
    public static void main(String[] args) {
        YourFrame03 yf03 = new YourFrame03();
        yf03.setSize(300,200);
        yf03.setVisible(true);
        yf03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
