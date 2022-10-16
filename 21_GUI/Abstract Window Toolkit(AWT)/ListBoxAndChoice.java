import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class YourFrame3 extends Frame implements ItemListener, ActionListener {
    List l;
    Choice c;
    TextArea ta;

    YourFrame3()
    {
        super("ListBox Demo");

        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Monday");
        l.add("TuesDay");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource() == l){
            ta.setText(l.getSelectedItem());
        } else{
            ta.setText(c.getSelectedItem());
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String list[] = l.getSelectedItems();

        String txt="";

        for(String x:list)
            txt+=x+"\n";

        ta.setText(txt);

//        l.addItem(txt);
    }

}
public class ListBoxAndChoice {
    public static void main(String[] args) {
        YourFrame3 fm3 = new YourFrame3();
        fm3.setSize(450,500);
        fm3.setVisible(true);
    }
}
