

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class booksearch extends BookShop {
       public static class FourthFrame extends Frame implements ActionListener {
        protected TextField searchBar;
        protected List l1;
        protected Button searchb;


        public FourthFrame() {
            Frame f3 = new Frame("bookSearch");
            Label l=new Label("PLS SEARCH FOR THE BOOK YOU WANT");
            l.setFont(new Font("Arial", 0, 20));
            l.setBounds(70,70,400,30);
            l.setForeground(Color.red);
            searchBar=new TextField();
            searchBar.setBounds(100, 140, 280, 20);
            searchBar.addActionListener(this);
            searchb =new Button("search");
            searchb.setBounds(400,140,80,20);

            f3.add(searchb);
            f3.add(searchBar);
            f3.add(l);



            f3.setSize(500, 500);
            f3.setResizable(false);
            f3.setLayout(null);
            f3.setVisible(true);
            f3.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f3.dispose();
                }
            });
        }

           @Override
           public void actionPerformed(ActionEvent e) {
               String s1=searchBar.getText();

           }
       }
}
