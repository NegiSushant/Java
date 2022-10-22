import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class YourFrame01 extends JFrame{
    YourFrame01(){
        JTextField jt = new JTextField(15);

        /*-----------------------------Date Format------------------------*/
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");//Show Month name
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//show month Number
        JFormattedTextField jf = new JFormattedTextField(df);
        jf.setColumns(20);
        jf.setValue(0);//Show the date when Java come in Existence
        //jf.setValue(new Date());//Show Today Date

        /*-----------------------------Number Format------------------------*/
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(1000);
        JFormattedTextField jf1 = new JFormattedTextField(nft);
        jf1.setColumns(20);


        /*-----------------------------Number Format with Currency Symbol------------------------*/
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft1 = new NumberFormatter(nf1);
        nft1.setAllowsInvalid(false);
        nft1.setMaximum(1000);
        JFormattedTextField jf2 = new JFormattedTextField(nft1);
        jf2.setColumns(20);
        jf2.setValue(0);

        //TextArea ta = new TextArea();

        setLayout(new FlowLayout());
        add(jt);
        add(jf);
        add(jf1);
        add(jf2);

    }
}

public class JTextAndJFormettedField {
    public static void main(String[] args) {
        YourFrame01 yf01 = new YourFrame01();
        yf01.setSize(400,350);
        yf01.setVisible(true);
        yf01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
