import java.awt.*;

class YourFrame7 extends Frame{
    Button btn1, btn2, btn3, btn4, btn5;

    public YourFrame7(){
        super("GridBag Layout");
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);

        btn1 = new Button("One");
        btn2 = new Button("Two");
        btn3 = new Button("Three");
        btn4 = new Button("Four");
        btn5 = new Button("Five");


        gbc.gridx = 1;
        gbc.gridy = 1;
        add(btn1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(btn2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(btn3, gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        add(btn4, gbc);

        gbc.gridx = 5;
        gbc.gridy = 5;
        add(btn5, gbc);

    }
}

public class LayoutGridBag {
    public static void main(String[] args){
        YourFrame7 yf7 = new YourFrame7();
        yf7.setSize(450, 300);
        yf7.setVisible(true);
    }
}
