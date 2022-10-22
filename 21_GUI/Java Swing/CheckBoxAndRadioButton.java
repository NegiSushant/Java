import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class YourFrame02 extends JFrame implements ActionListener {
    JCheckBox c1, c2;
    JRadioButton r1, r2;

    JTextField tf;

    YourFrame02() {
        super("CheckBox & RadioButton");

        tf = new JTextField("CheckBox & RadioButton Text",20);
        tf.setBounds(10,20,100,80);

        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);

        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("UPPER");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");

        setLayout(new FlowLayout());

        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }

    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "lower" -> tf.setText(tf.getText().toLowerCase());
            case "UPPER" -> tf.setText(tf.getText().toUpperCase());
        }
        int b = 0,i = 0;

        if(c1.isSelected())b = Font.BOLD;
        if(c2.isSelected())i = Font.ITALIC;

        Font f = new Font("Times New Roman",b|i,15);
        tf.setFont(f);
    }
}


public class CheckBoxAndRadioButton {
    public static void main(String[] args) {
        YourFrame02 yf02 = new YourFrame02();
        yf02.setSize(400,400);
        yf02.setVisible(true);
        yf02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
