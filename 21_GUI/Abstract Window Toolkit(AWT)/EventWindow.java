import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class YourFrame11 extends Frame implements WindowListener {

    Label l;

    YourFrame11() {
        super("Window Event Demo");
        l=new Label("No Message from Window");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    public void windowOpened(WindowEvent we) {
        l.setText("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        l.setText("Window De iconified");
    }

    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        l.setText("Window De Activated");
    }

}
public class EventWindow {
    public static void main(String[] args) {
        YourFrame11 y11 = new YourFrame11();
        y11.setSize(500, 450);
        y11.setVisible(true);
    }
}
