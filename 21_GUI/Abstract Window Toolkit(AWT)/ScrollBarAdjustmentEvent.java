import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class YourFrame4 extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    TextField tf;

    YourFrame4(){
        super("ScrollBar");
        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);

        tf = new TextField(20);

        tf.setBounds(50, 50, 300,50);
        red.setBounds(50,150,400,50);
        green.setBounds(50, 200,500,30);
        blue.setBounds(50,250,550,30);

        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }
}
public class ScrollBarAdjustmentEvent {
    public static void main(String[] args){
        YourFrame4 yf = new YourFrame4();
        yf.setSize(500, 600);
        yf.setVisible(true);
    }
}
