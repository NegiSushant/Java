import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame04 extends Frame{
    int x = 0, y = 0;
    MyFrame04(){
        super("Paintings");
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics gh){
        gh.setColor(Color.red);
        gh.fillOval(x, y, 50, 50);
    }
}
public class PaintingColorFont {
    public static void main(String[] args) {
        MyFrame04 mf04 = new MyFrame04();
        mf04.setSize(400, 350);
        mf04.setVisible(true);
    }
}
