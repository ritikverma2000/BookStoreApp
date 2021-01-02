import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class  BookShop extends Frame implements ActionListener {
    protected Button login,signUp,booksearch;
    public BookShop() {
        final Frame f = new Frame("BookStoreApp");
        Label l = new Label("WELCOME TO RVTS BOOK STORE");
        Font fl = new Font("TimesRoman", 1, 20);
        l.setBounds(110, 100, 400, 50);
        l.setFont(fl);
        l.setForeground(Color.red);
        f.add(l);
        login = new Button("Login");
        login.setBounds(180, 190, 200, 80);
        f.add(login);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpart.secondFrame();
            }
        });
        login.addActionListener(this);
        signUp = new Button("SignUp");
        signUp.setBounds(180, 300, 200, 80);
        f.add(signUp);
        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new signUp.thirdFrame();
            }
        });
        booksearch = new Button("BookSearch");
        booksearch.setBounds(180, 400, 200, 80);
        f.add(booksearch);
        booksearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new booksearch.FourthFrame();
            }
        });
        f.setSize(600, 600);
        f.setBackground(Color.CYAN);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
        f.setResizable(false);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new BookShop();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
