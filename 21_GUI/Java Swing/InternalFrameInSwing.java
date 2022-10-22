import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class YourFrame06 extends JInternalFrame {
    static int count = 0;
    JTextArea ta;
    JScrollPane sp;

    YourFrame06() {
        super("Documents"+(++count),true,true,true,true);
        ta=new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}
class YourFrame07 extends JFrame implements ActionListener {
    JDesktopPane dp;
    YourFrame07() {
        super("Internal Frame");
        dp = new JDesktopPane();
        setContentPane(dp);
        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("new");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        YourFrame06 mi = new YourFrame06();
        dp.add(mi);
    }
}
public class InternalFrameInSwing {
    public static void main(String[] args) {
        YourFrame07 yf07 = new YourFrame07();
        yf07.setSize(500,400);
        yf07.setVisible(true);
        yf07.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
