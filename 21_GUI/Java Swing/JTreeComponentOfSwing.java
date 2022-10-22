import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

class YourFrame04 extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    YourFrame04() {
        super("JTree");
        //valid path must be given
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("D:\\Java Exercise\\02_Java Course\\22_Swing(GUI)");
        File f = new File("D:\\Java Exercise\\02_Java Course\\22_Swing(GUI)");

        for(File x : f.listFiles()) {
            if(x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles()) {
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree = new JTree(root);
        label = new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp = new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class JTreeComponentOfSwing {
    public static void main(String[] args) {
        YourFrame04 yf04 = new YourFrame04();
        yf04.setSize(400, 300);
        yf04.setVisible(true);
        yf04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
