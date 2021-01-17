import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Cart extends  BookShop{

    public static class FifthFrame extends Frame {
        JButton b1;
        JLabel l1;

        public  FifthFrame(){
            setTitle("Background Color for JFrame");
            setSize(400,400);
            setLocationRelativeTo(null);

            setVisible(true);
            setLayout(new BorderLayout());
            JLabel background=new JLabel(new ImageIcon("D:\\java\\BookStoreApp\\BookStoreAppFiles\\src\\HomePageBackground.jpg"));
            add(background);
            background.setLayout(new FlowLayout());
            l1=new JLabel("Here is a button");
            b1=new JButton("I am a button");
            background.add(l1);
            background.add(b1);



        }
        public static void main(String[] args) {



        }
    }
}
