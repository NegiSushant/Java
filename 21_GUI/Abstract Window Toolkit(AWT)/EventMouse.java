import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class YourFrame10 extends Frame implements MouseListener, MouseMotionListener {
    Label l,l2;

    YourFrame10() {
        super("Mouse Event Demo");

        l=new Label("");
        l2=new Label("");

        setLayout(null);

        l.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void mouseClicked(MouseEvent me) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent me) {
        l.setText("Mouse Pressed");

    }

    public void mouseReleased(MouseEvent me) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent me) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent me) {
        l.setText("Mouse Exited");
    }


    public void mouseDragged(MouseEvent me) {
        l.setText("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent me) {
        l.setText("Mouse Move");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

}

public class EventMouse {
    public static void main(String[] args) {
        YourFrame11 yf9 = new YourFrame11();
        yf9.setSize(500, 450);
        yf9.setVisible(true);
    }
}
