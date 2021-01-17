import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class  BookShop extends Frame implements ActionListener {
    protected Button login,booksearch,cart;
    BufferedImage img;
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

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new loginpart.secondFrame();
            }
        });
        login.addActionListener(this);

        cart =new Button("Cart");
        cart.setBounds(180,300,200,80);
        cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cart.FifthFrame();
            }
        });


        booksearch = new Button("BookSearch");
        booksearch.setBounds(180, 400, 200, 80);

        booksearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new booksearch.FourthFrame();
            }
        });

        try {
            img = ImageIO.read (new File("D:\\java\\BookStoreApp\\BookStoreAppFiles\\src\\HomePageBackground.jpg"));
        }
        catch (IOException ex){

        }


        f.add(booksearch);
        f.add(cart);
        f.add(login);

        f.setSize(600, 600);
        f.setBackground(Color.CYAN);
        f.setLayout((LayoutManager)null);
        f.setResizable(false);
        f.setVisible(true);

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
    public void paint( Graphics g){
        super.paint(g);
        g.drawImage(img,0,0,getWidth(),getHeight(),null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
