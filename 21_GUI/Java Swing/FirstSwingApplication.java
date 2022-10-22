import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class YourFrame extends JFrame implements ActionListener {
    JLabel jl;
    JButton jb;
    int count = 0;

    YourFrame(){
        super("First Swing Application");

        setLayout(new FlowLayout());
        jl = new JLabel("Clicked "+count+" Times");
        jb = new JButton("Click");

        add(jl);
        add(jb);
        //add(new Button("Cancel"));
        jb.addActionListener(this);

        getRootPane().setDefaultButton(jb);
        //jb.setIcon(new ImageIcon("address"));
        jl.setToolTipText("Counter");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        jl.setText("CLicked "+count+" Times");
    }
}

public class FirstSwingApplication {
    public static void main(String[] args) {
        YourFrame yf = new YourFrame();
        yf.setSize(400,300);
        yf.setVisible(true);
        yf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
