import java.awt.*;
public class FrameBasedApplication extends Frame{
    /*-----------------2nd method------------*/
    Label l;
    TextField tf;
    Button b;

    public FrameBasedApplication() {
        super("My App");

        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args){
        /*-----------------1st Method-----------------*/

        Frame fm = new Frame("First Java App");
        fm.setLayout(new FlowLayout());

        Button bn = new Button("OK");
        Label lb = new Label("Name");
        TextField tf = new TextField(20);

        fm.add(lb);
        fm.add(tf);
        fm.add(bn);

        fm.setSize(300, 300);
        fm.setVisible(true);


        /*-----------------2nd method Call------------*/
        FrameBasedApplication f=new FrameBasedApplication();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
