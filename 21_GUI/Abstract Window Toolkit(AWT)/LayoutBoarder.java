import java.awt.*;

class YourFrame6 extends Frame{
    Button bnt1, bnt2, bnt3, bnt4, bnt5,bnt6;

    public YourFrame6(){
        super("Boarder Layout");

        bnt1 = new Button("one");
        bnt2 = new Button("two");
        bnt3 = new Button("three");
        bnt4 = new Button("four");
        bnt5= new Button("five");
        bnt6 = new Button("six");


        add(bnt1, BorderLayout.NORTH);
        //add(bnt2, BorderLayout.SOUTH);
        add(bnt3, BorderLayout.EAST);
        add(bnt4, BorderLayout.WEST);
        add(bnt5, BorderLayout.CENTER);
        add(bnt6, BorderLayout.AFTER_LINE_ENDS);

        Panel pl = new Panel();
        pl.setLayout(new GridLayout(3, 1));
        pl.add(new Button("Mon"));
        pl.add(new Button("Tue"));
        pl.add(new Button("Wed"));
        add(pl,BorderLayout.SOUTH);
    }
}

public class LayoutBoarder {
    public static void main(String[] args) {
        YourFrame6 ym = new YourFrame6();
        ym.setSize(400, 300);
        ym.setVisible(true);
    }
}
