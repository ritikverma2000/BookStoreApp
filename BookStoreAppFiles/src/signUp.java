import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class signUp {
    public signUp() {

    }
    public static class thirdFrame extends Frame implements ActionListener {
        protected Label fname;
        protected Label lname;
        protected Label uname;
        protected Label upass;
        protected Label mno;
        protected Label adde;
        protected TextField n1;
        protected TextField n2;
        protected TextField n3;
        protected TextField n4;
        protected TextField n5;
        protected TextField n6;
        protected Button signUpbutton;

        public thirdFrame() {
            final Frame f2 = new Frame("signup");
            this.fname = new Label("First Name:", 1);
            this.fname.setFont(new Font("Arial", 0, 15));
            this.fname.setSize(100, 20);
            this.fname.setLocation(40, 100);
            this.n1 = new TextField();
            this.n1.setFont(new Font("Arial", 0, 15));
            this.n1.setBounds(155, 100, 150, 20);
            this.lname = new Label("Last Name:");
            this.lname.setFont(new Font("Arial", 0, 15));
            this.lname.setBounds(50, 140, 100, 20);
            this.n2 = new TextField();
            this.n2.setFont(new Font("Arial", 0, 15));
            this.n2.setBounds(155, 140, 150, 20);
            this.uname = new Label("User Name:");
            this.uname.setFont(new Font("Arial", 0, 15));
            this.uname.setBounds(50, 180, 150, 20);
            this.n3 = new TextField();
            this.n3.setFont(new Font("Arial", 0, 15));
            this.n3.setBounds(155, 180, 150, 20);
            this.upass = new Label("Password:");
            this.upass.setFont(new Font("Arial", 0, 15));
            this.upass.setBounds(50, 220, 150, 20);
            this.n4 = new TextField();
            this.n4.setFont(new Font("Arial", 0, 15));
            this.n4.setBounds(155, 220, 150, 20);
            this.mno = new Label("Mobile No:");
            this.mno.setFont(new Font("Arial", 0, 15));
            this.mno.setBounds(50, 260, 150, 20);
            this.n5 = new TextField();
            this.n5.setFont(new Font("Arial", 0, 15));
            this.n5.setBounds(155, 260, 150, 20);
            this.adde = new Label("Address:");
            this.adde.setFont(new Font("Arial", 0, 15));
            this.adde.setBounds(50, 300, 150, 20);
            this.n6 = new TextField();
            this.n6.setFont(new Font("Arial", 0, 15));
            this.n6.setBounds(155, 300, 150, 20);
            this.signUpbutton = new Button("SIGN-UP");
            this.signUpbutton.setBounds(140, 360, 100, 20);
            this.signUpbutton.addActionListener(this);
            f2.add(this.signUpbutton);
            f2.add(this.n6);
            f2.add(this.adde);
            f2.add(this.n5);
            f2.add(this.mno);
            f2.add(this.n4);
            f2.add(this.upass);
            f2.add(this.n3);
            f2.add(this.uname);
            f2.add(this.n2);
            f2.add(this.lname);
            f2.add(this.n1);
            f2.add(this.fname);
            f2.setSize(700, 700);
            f2.setBounds(10, 10, 370, 600);
            f2.setResizable(false);
            f2.setLayout((LayoutManager)null);
            f2.setVisible(true);
            f2.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f2.dispose();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
            String fname = this.n1.getText();
            String lname = this.n2.getText();
            String uname = this.n3.getText();
            String pass = this.n4.getText();
            String mno = this.n5.getText();
            String adde = this.n6.getText();
            if (e.getSource() == this.signUpbutton) {
                System.out.println(fname);
                System.out.println(lname);
                System.out.println(uname);
                System.out.println(pass);
                System.out.println(mno);
                System.out.println(adde);
            }

        }
    }


}
