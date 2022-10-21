import java.awt.*;

class YourFrame5 extends Frame{
    Button b1, b2, b3, b4, b5, b6;
    public YourFrame5(){
        super("FlowLayout");

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(100);

        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}
public class LayoutFlow {
    public static void main(String[] args) {
        YourFrame5 fm = new YourFrame5();
        fm.setSize(500, 500);
        fm.setVisible(true);
    }
}
