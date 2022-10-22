import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class YourFrame09 extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;

    YourFrame09() {
        super("Split Pane");

        String cols[] = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK"};

        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);


        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2 = new JScrollPane(lbl);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        sp.setDividerLocation(200);

        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label",p2);
        add(tp);

    }

    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        String str=(String)list.getSelectedValue();

        switch (str) {
            case "RED" -> lbl.setBackground(Color.red);
            case "GREEN" -> lbl.setBackground(Color.green);
            case "BLUE" -> lbl.setBackground(Color.blue);
            case "YELLOW" -> lbl.setBackground(Color.yellow);
            case "MAGENTA" -> lbl.setBackground(Color.magenta);
            case "ORANGE" -> lbl.setBackground(Color.orange);
            case "BLACK" -> lbl.setBackground(Color.black);
        }
    }
}


public class SplitPaneInSwing {
    public static void main(String[] args) {
        YourFrame09 yf09 = new YourFrame09();
        yf09.setSize(500, 400);
        yf09.setVisible(true);
        yf09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
