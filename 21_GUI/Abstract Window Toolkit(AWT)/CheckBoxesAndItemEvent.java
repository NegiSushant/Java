import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class YourFrame extends Frame implements ItemListener {
    Label lb;
    Checkbox c1, c2, c3;

    public YourFrame(){
        super("Check Box");
        lb = new Label("Nothing is selected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C#");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(lb);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(c1.getState()){
            str = str+ " "+c1.getLabel();
        }
        if(c2.getState()){
            str = str+ " "+c2.getLabel();
        }
        if(c3.getState()){
            str = str+ " "+c3.getLabel();
        }
        if(str.isEmpty()){
            str = "Nothing is selected!";
        }
        lb.setText(str);
    }
}
public class CheckBoxesAndItemEvent {
    public static void main(String[] args){
        YourFrame fm = new YourFrame();
        fm.setSize(500, 500);

        fm.setVisible(true);
    }
}
